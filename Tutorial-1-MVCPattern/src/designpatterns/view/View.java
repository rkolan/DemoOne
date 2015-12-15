package designpatterns.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import designpatterns.model.Model;

public class View extends JFrame implements ActionListener{
	private Model model;
	private JButton helloButton;
	private JButton goodBye;

	public View(Model model)  {
		super();
		this.model = model;

helloButton=new JButton("Hello");
goodBye=new JButton("Good Bye");

setLayout(new GridBagLayout());

GridBagConstraints gc=new GridBagConstraints();
gc.anchor=GridBagConstraints.CENTER;

gc.gridx=1;
gc.gridy=1;
gc.weightx=1;
gc.weighty=1;
gc.fill=GridBagConstraints.NONE;

add(helloButton,gc);


gc.anchor=GridBagConstraints.CENTER;
gc.gridx=1;
gc.gridy=10;
gc.weightx=1;
gc.weighty=1;
gc.fill=GridBagConstraints.NONE;
add(goodBye,gc);

helloButton.addActionListener(this);
goodBye.addActionListener(this);


goodBye.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Sorry for leaving");
		
	}
	
	
});

setSize(600,500);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton source=(JButton)e.getSource();
		
		if(source == helloButton) {
			System.out.println("Hello");
		}
		else{
			System.out.println("Some other Button");
		}
	}
}