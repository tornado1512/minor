package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import models.*;

public class OwnerRegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{

        String nextPage=" ";

		HttpSession session=request.getSession();
		String ownerName = request.getParameter("oname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword = request.getParameter("repass");

		boolean flag = true;
		String errorMessage = "";

		if(ownerName.length()<3){
			flag = false;
			errorMessage = errorMessage + "Name must be at least 3 characters length<br />";
		}

		Pattern p = Pattern.compile("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
		Matcher m = p.matcher(email);
		if(!m.matches()){
			flag = false;	
			errorMessage = errorMessage + "An inavalid Email...<br />";
		}

		int passwordLength = password.length(); 
		if(passwordLength<6||passwordLength>12){
			flag = false;
			errorMessage = errorMessage + "Password must be at least 6 charcters and at max 12 charcters<br />";
		}

		if(!password.equals(rePassword)){
			flag = false;
			errorMessage = errorMessage + "Password and Retype Password must match<br />";
		}

		RegisterOwner owner=new RegisterOwner(ownerName ,email,password);
		if(flag){
			if(owner.saveRecord()){
				nextPage="rest_register.jsp";
				int oid = owner.getOwnerId();
				request.setAttribute("oid",oid);
			}
		}else{
			request.setAttribute("err_msg",errorMessage);
		}

		System.out.println(flag+" ~~~~~~ "+nextPage);

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}