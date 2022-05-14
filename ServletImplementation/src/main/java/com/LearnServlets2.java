package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class LearnServlets2
 */
public class LearnServlets2 extends HttpServlet {
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Hi! This is being called from the init  method");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String s1 = request.getParameter("value1");
		String s2 = request.getParameter("value2");
		

		PrintWriter out = response.getWriter();

		out.write("<h1> Hi "+s2+","+s1+"!"+"<br> this is being printed from the Service Method of the servlet LearnServlets!</h1>");
		

		System.out.println("Hi! This is being called from the service method and you have passed the 2 Values "+ s1+"and "+s2);
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		System.out.println("Hi! This is being called from the destroy method");
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Hi! This is being called from the ServletConfig method");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Hi! This is being called from the getServletInfo method");
		// TODO Auto-generated method stub
		return null;
	}

}
