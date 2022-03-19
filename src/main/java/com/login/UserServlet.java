package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
//	private UsersDao userDao = new UsersDao();
//    
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
//		String surname = request.getParameter("surname");
//		String profession = request.getParameter("profession");
//		
//		UserBean user = new UserBean();
//		user.setUsername(username);
//		user.setPassword(password);
//		user.setName(name);
//		user.setSurname(surname);
//		user.setProfession(profession);
//		
//		try {
//			userDao.registerUser(user);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		RequestDispatcher rd = request.getRequestDispatcher("userpage.jsp");
//		rd.forward(request, response);
//		
//		
//	}

	
	
}
