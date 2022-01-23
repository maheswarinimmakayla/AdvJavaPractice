package com.mouritech.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServletExample
 */
@WebServlet("/StudentServletExample")
public class StudentServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
   /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	String stdName = request.getParameter("stdName");
	System.out.println("<h1> Enter Name = " +stdName +"</h1>");
	String stdFatherName = request.getParameter("stdFatherName");
	System.out.println("<h1> Enter Name = " +stdFatherName +"</h1>");
	String stdMotherName = request.getParameter("stdMotherName");
	System.out.println("<h1> Enter Name = " +stdMotherName +"</h1>");
	String stdAddress = request.getParameter("stdAddress");
	System.out.println("<h1> Enter Name = " +stdAddress +"</h1>");
	
	
	}

}
