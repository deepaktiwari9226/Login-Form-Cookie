package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/profile")
public class profile extends HttpServlet

{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
	 Cookie[] ck =req.getCookies();
	 if(ck==null) {
		 resp.sendRedirect("index.html");
	 } else {
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.print("<h1> Email = "+ck[0].getValue()+"</h1>");
		 out.print("<h1> Password = "+ck[1].getValue()+"</h1>");
		 out.print("<a href='logout'>logout </a>");
	 }
	}

}
