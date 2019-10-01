package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;

public class UserLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	String errmsg = "";

	String nextPage="login.jsp";
	String email=request.getParameter("email");
	String password=request.getParameter("passw");
	User user=new User(email,password);
	if(user.checkLogin()){
		nextPage="home.jsp";
	}
	else{
		errmsg="Login Fails!!!! Plzzzzzz try again";
		request.setAttribute("error_msg",errmsg);
	}
	request.getRequestDispatcher(nextPage).forward(request,response);
	}
}