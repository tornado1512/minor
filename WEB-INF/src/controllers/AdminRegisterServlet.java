package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import models.*;

public class AdminRegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage="";

		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword=request.getParameter("repass");

		AdminRegistration admin = new AdminRegistration(email,password);
			if(admin.saveRecord()){
				nextPage="admin_login.jsp";
			}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}

