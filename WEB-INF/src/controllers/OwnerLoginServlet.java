package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;


 public class OwnerLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	HttpSession session = request.getSession();
	String nextPage="";
	String oname = request.getParameter("oname");
	String email=request.getParameter("email");
	String password=request.getParameter("passw");
	RegisterOwner owner=new RegisterOwner(oname,email,password);
	if(owner.checkLogin()){
		nextPage="my_rest_home.jsp";
	}
	Integer ownerId=owner.getOwnerId();
	session.setAttribute("ownerId",ownerId);
	System.out.println(ownerId+"inside ols");
	request.getRequestDispatcher(nextPage).forward(request,response);
	}
}