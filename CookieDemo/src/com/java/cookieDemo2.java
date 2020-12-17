package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookieDemo2
 */
@WebServlet("/cookieDemo2")
public class cookieDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookieDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter output = response.getWriter();
		String sum = request.getParameter("sum"); 
//		String val = (String) request.getAttribute("val");
		output.print("<h1>"+"Your current score is:"+ sum+"<h1>");
		output.println("What is 2^4 ?");
		
		Cookie c = new Cookie("sum", sum);// for creating cookie
		//now you need to send it to the next page
		response.addCookie(c);
		//for creating another form
		output.print("<form method='post' action ='servlet2'>");// if you are not writing any method it is automatically going towards get
		output.print("<input type=\"radio\" id=\"eight\" name=\"sqroot\" value=\"0\">");
		output.print("<label for=\"eight\">8</label><br>");
		output.print("<input type=\"radio\" id=\"sixteen\" name=\"sqroot\" value=\"10\">");
		output.print("<label for=\"sixteen\">16</label><br>");
		output.print("<input type=\"radio\" id=\"thrtytwo\" name=\"sqroot\" value=\"0\">");
		output.print("<label for=\"thrtytwo\">32</label><br>");
		output.print("<br>");
		output.print("<input type ='submit' value ='go'>");
		
		output.print("</form>");
	}

}
