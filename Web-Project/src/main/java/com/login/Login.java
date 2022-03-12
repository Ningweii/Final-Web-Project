package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {																
	
		Register register = new Register();
		User user = new User();
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");	
		
		LoginDao loginDao = new LoginDao();
		
		if(loginDao.check(username, password)) {
			session.setAttribute("username", username);
			session.setAttribute("password", password);	
			
			response.sendRedirect("userpage.jsp");
		}
		else {
			response.sendRedirect("loginagain.jsp");
		}
	
		
	}

}











