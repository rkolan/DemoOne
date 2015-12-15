package designpatterns;

import javax.swing.SwingUtilities;

import designpatterns.controller.Controller;
import designpatterns.model.Model;
import designpatterns.view.View;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable () {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				runApp();
				
			}
			
		});

	}

	public static void runApp(){
		Model model=new Model();
		View view=new View(model);
		Controller controller=new Controller(model,view);
		
	}
	
}
