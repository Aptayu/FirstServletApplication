package com.practice;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet  extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Welcome</h1>");
		
		String name = request.getParameter("usre_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String cond = request.getParameter("condition");
		
		if(cond != null) {
			out.println("<h1>Name: " + name + "</h1>");
			out.println("<h1>Email: " + email + "</h1>");
			out.println("<h1>Gender: " + gender + "</h1>");
			out.println("<h1>Course: " + course + "</h1>");
			
//			If you want to save JDBC 
		}
		else
			out.println("<h1>Please accept T & C</h1>");
	}
	
	
}

