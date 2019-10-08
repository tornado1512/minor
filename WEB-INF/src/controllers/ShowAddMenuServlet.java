package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowAddMenuServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{

		//System.out.println(request.getQueryString());
		request.getRequestDispatcher("add_menu.jsp").forward(request,response);
	}
}