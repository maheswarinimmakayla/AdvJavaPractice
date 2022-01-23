package com.mouritech.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServletData
 */
@WebServlet("/EmployeeServletData")
public class EmployeeServletData extends HttpServlet {
	static Connection con; // = null;
	static PreparedStatement pstmt; // = null;
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			//Here the text to be printed on the browser
			PrintWriter out = response.getWriter();
			//read the data entered in the html

			int employeeId;
			employeeId=Integer.parseInt(request.getParameter("empid"));
			String employeeName = request.getParameter("empname");
			String date=request.getParameter("empdob");

			String employeeEmail = request.getParameter("empemail");
			Long employeePhone;
			employeePhone=Long.parseLong(request.getParameter("emptel"));
			String employeeCourse = request.getParameter("empcourse");

	        System.out.println("<h1> Student Id="+employeeId+ "Student Name = " +employeeName + "Student DoB ="+date+

			"Student Email = "+employeeEmail +"Student phone="+employeePhone+"Student Course="+employeeCourse+"</h1>");

	        con = DBConnection.getDBConnection();
			String insertEmloyee = "insert into employee_reg values(?,?,?,?,?,?);";
			
			pstmt = con.prepareStatement(insertEmloyee);
			pstmt.setInt(1, employeeId);
			pstmt.setString(2, employeeName);
			pstmt.setString(3,date);
			pstmt.setString(4, employeeEmail);
			pstmt.setLong(5, employeePhone);
			pstmt.setString(6, employeeCourse);
			int i = pstmt.executeUpdate();
			if(i != 0) {
				out.println("inserted successfully");
			}else {
				out.println("Not inserted");
			}


			}catch (Exception e) {
			e.printStackTrace();
			}
	}

}
