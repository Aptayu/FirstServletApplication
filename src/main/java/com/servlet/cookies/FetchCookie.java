package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchCookie
 */
@WebServlet("/FetchCookie")
public class FetchCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
//		getting all the cookies
		Cookie[] cookies = request.getCookies();
		boolean f = false;
		String name = "";
		if(cookies == null) {
			out.println("<h1>You are a new user go back to home </h1>");
			return;
		}
		else {
			for(Cookie c : cookies) {
				String tname = c.getName();
				if(tname.equals("user_name")) {
					f = true;
					name = c.getValue();
				}
			}
		}
		if(f) {
			out.print("<h1>Cookie for " + name + " is 0000.</h1>");
		}
		else {
			out.print("<h1>We cant find your cookie. Please go to home and enter your name</h1>");
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
