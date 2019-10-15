package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;
import java.util.*;

public class MyRestServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		Integer restRegisterId = Integer.parseInt(request.getParameter("rest_id"));
		RestRegister rest=RestRegister.collectRest(restRegisterId);
		ArrayList<String> pics=RestPic.collectPics(restRegisterId);
		
		
		//System.out.println(packagee.getPackageName()+"-----");
		request.setAttribute("rest",rest);
		request.setAttribute("pics",pics);
		request.getRequestDispatcher("my_rest1.jsp").forward(request,response);
	}
}