package com.pentty;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.LocalDate;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Xmlservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		out.println("Hello from the Get method" + userName + " And your userId is " + userId);
		
}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
	
		if (userName !="" && userName !=null) {
			session.setAttribute("savedUsername", userName);
			context.setAttribute("savedUsername", userName);
		}
		out.println("Request parameter has username as " + userName);
		out.println("Session parameter has username as " + (String) session.getAttribute("savedUsername"));
		out.println("Context parameter has username as " + (String) context.getAttribute("savedUsername"));
		
		
		String fullName = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		out.println("Hello from Post method " + userName + " And your Full Name is " + fullName);
		out.println("Your profession is" + prof );
		String location = request.getParameter("location");
		String [] locations = request.getParameterValues("location");
		out.println("You are at " + locations.length + "locations" );
		//out.println("Your location is" + locations );
		for (int i=0; i<locations.length; i++) {
			out.println(locations[i]);
		}
		
	}
	
}
	
	


