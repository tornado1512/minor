package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;


 public class AdminLoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	String nextPage="";
	String email=request.getParameter("email");
	String password=request.getParameter("passw");
	AdminRegistration admin= new AdminRegistration(email,password);
	if(admin.checkLogin()){
		//System.out.println("hello");
		nextPage="add_packages.jsp";
	}
	request.getRequestDispatcher(nextPage).forward(request,response);
	}
}