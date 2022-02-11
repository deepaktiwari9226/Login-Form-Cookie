package com.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/login")
public class login extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String email = req.getParameter("em");
    String password = req.getParameter("ps");
    Cookie ck = new Cookie("em",email);
    Cookie ck1 = new Cookie("ps",password);
    
    resp.addCookie(ck);
    resp.addCookie(ck1);
    
    resp.sendRedirect("profile");
	
	}

}
