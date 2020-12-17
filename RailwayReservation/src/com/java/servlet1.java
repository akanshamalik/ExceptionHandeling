package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter output = response.getWriter();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String meal = request.getParameter("meal");
		String list1 = request.getParameter("list1");
		String list2 = request.getParameter("list2");

		request.setAttribute("firstname",firstname);
		request.setAttribute("lastname",lastname);
		request.setAttribute("gender",gender);
		request.setAttribute("meal",meal);
		request.setAttribute("list1",list1);
		request.setAttribute("list2",list2);
		RequestDispatcher disp = request.getRequestDispatcher("welcome.jsp");
		disp.forward(request,response);
		output.println("<h3>"+"FirstName:" + firstname + "</h3>");
	}

}
