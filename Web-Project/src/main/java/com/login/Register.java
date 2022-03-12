package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	private UsersDao usersDao = new UsersDao();
	User user = new User();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {														
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String passwordRepeat = request.getParameter("password-repeat");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String profession = request.getParameter("profession");
		
		if(password.equals(passwordRepeat)) {
			
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setName(name);
			user.setSurname(surname);
			user.setProfession(profession);
			
			
			HttpSession session = request.getSession();
			session.setAttribute("username", user.getUsername());
			session.setAttribute("password", user.getPassword());
			session.setAttribute("name", user.getName());
			session.setAttribute("surname", user.getSurname());
			session.setAttribute("profession", user.getProfession());

			
			try {
				usersDao.registerUser(user);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			response.sendRedirect("userpage.jsp");
		}
		else {
			response.sendRedirect("registeragain.jsp");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}









