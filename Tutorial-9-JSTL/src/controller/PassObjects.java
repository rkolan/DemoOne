package controller;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;

/**
 * Servlet implementation class PassObjects
 */
@WebServlet("/PassObjects")
public class PassObjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassObjects() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user1=new User("testing",1);
		User user2=new User("sweety",2);
		User user3=new User("pinky",3);
		
		request.setAttribute("user1", user1);
		
		HttpSession session=request.getSession();
		session.setAttribute("user2", user2);
		
		ServletContext context=getServletContext();
		context.setAttribute("user3", user3);
		
		ArrayList<User> list1= new ArrayList<>();
		list1.add(new User("cat",1));
		list1.add(new User("dog",2));
		list1.add(new User("camel",3));
		list1.add(new User("ox",4));
		list1.add(new User("parrot",5));
		
		session.setAttribute("list1", list1);
		
		request.getRequestDispatcher("/receiveObjects.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
