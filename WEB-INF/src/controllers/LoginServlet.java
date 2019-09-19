package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	String nextPage="login.jsp";
	String email=request.getParameter("email");
	String password=request.getParameter("passw");
	User user=new User(email,password);
	if(user.checkLogin()){
		nextPage="home.jsp";
	}
	request.getRequestDispatcher(nextPage).forward(request,response);
	}
}