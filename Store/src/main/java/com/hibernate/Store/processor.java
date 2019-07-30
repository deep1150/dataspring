package com.hibernate.Store;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.Store.controller.EmpController;
import com.hibernate.Store.model.Employee;

/**
 * Servlet implementation class processor
 */
@WebServlet("/processor")
public class processor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Autowired   
	EmpController empController;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public processor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		HttpSession hsn = request.getSession();
		
			System.out.println("in the preprocessor");
			int id=Integer.parseInt(request.getParameter("empid"));
			int salary=Integer.parseInt(request.getParameter("empsal"));
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			Date d = null;
			try {
				d=(Date) new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("doj"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			Employee emp=new Employee(id,fname,lname,salary,d);
			empController.addEmp(emp);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
