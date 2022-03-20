package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LengthServlet")
public class LengthServlet extends HttpServlet { 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		double mile = 0;
		double kilometer = 0;
		
		if(request.getParameter("mile").isEmpty() && request.getParameter("kilometer").isEmpty()) {
			out.print("You must submit at least one number...");
		}
			else if(request.getParameter("mile").isEmpty()) {
				kilometer = Double.parseDouble(request.getParameter("kilometer"));
				double kilometerToMile = kilometer * 0.6;
				out.print(kilometer + " kilometers is " + kilometerToMile + " miles!");
		}
			else if(request.getParameter("kilometer").isEmpty()) {
				mile = Double.parseDouble(request.getParameter("mile"));
				double mileToKilometer = mile * 1.6;
				out.print(mile + " miles is " + mileToKilometer + " kilometers");
		}else out.print("Wft..?");
		
		
		
		
		

		
		
		
	}

}
