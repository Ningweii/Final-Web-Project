package com.login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.cj.Session;

import java.io.PrintWriter;
import java.io.IOException;
 
@WebServlet("/BmiServlet")
public class BmiServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{											
		PrintWriter out = response.getWriter();

		
		double mass = Double.parseDouble(request.getParameter("mass"));
		double height = Double.parseDouble(request.getParameter("height"));
		double bmi = mass / (height * height);

		String bmiToStr = String.valueOf(bmi).substring(4, 7);
		double bmiToDouble = Double.parseDouble(bmiToStr) / 10;
		
		out.println("Your BMI is " + bmiToDouble);
		
		if(bmiToDouble < 18.5) 
			out.print("You're too skinny. Go grab some food immeadiately.");
		else if(bmiToDouble >= 18.5 && bmiToDouble <= 24.9)
			out.print("You're perfectly fine as you are!");
		else if(bmiToDouble > 24.9 && bmiToDouble <= 29.9)
			out.print("You need to lose some weight!");
		else out.print("You are obese. You probably didn't know that, right...");
		
	}

}














