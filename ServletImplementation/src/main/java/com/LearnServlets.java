package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class LearnServlets
 */
public class LearnServlets implements Servlet {

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Hi! This is being called from the init  method");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.write("<h1> Hi! this is being printed from the Service Method of the servlet LearnServlets!</h1>");

		System.out.println("Hi! This is being called from the service method");
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
