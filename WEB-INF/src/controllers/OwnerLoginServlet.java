package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;


 public class OwnerLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	String nextPage="";
	String oname = request.getParameter("oname");
	String email=request.getParameter("email");
	String password=request.getParameter("passw");
	RegisterOwner owner=new RegisterOwner(oname,email,password);
	if(owner.checkLogin()){
		nextPage="my_rest_home.jsp";
	}
	request.getRequestDispatcher(nextPage).forward(request,response);
	}
}