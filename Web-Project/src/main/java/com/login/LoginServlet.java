package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {																
	
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");	
		String name = "";
		String surname = "";
		String profession = "";
		
		LoginDao loginDao = new LoginDao();
		
		if(loginDao.isValid(username, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);	
			
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_data", "root", "12345678");
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM users WHERE username='"+username+"'");
				while(rs.next()) {
					name = rs.getString("name");
					surname = rs.getString("surname");
					profession = rs.getString("profession");
				}
				request.setAttribute("name", name);
				request.setAttribute("surname", surname);
				request.setAttribute("profession", profession);
				
				session.setAttribute("name", name);
				session.setAttribute("surname", surname);
				session.setAttribute("profession", profession);
				
				request.getRequestDispatcher("userpage.jsp").forward(request, response);
			
			
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			response.sendRedirect("userpage.jsp");
		}
		else {
			response.sendRedirect("loginagain.jsp");
		}
	
		
	}

}











