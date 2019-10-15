package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import models.*;

public class SouthIndianRestServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		String nextPage="south_indian_rest.jsp";

		ArrayList<RestRegister> rests=RestRegister.collectSouthIndianRest();
		for(RestRegister rest:rests){
			System.out.println(rest.getRestName()+"rest");
			}
		session.setAttribute("rests",rests);
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}