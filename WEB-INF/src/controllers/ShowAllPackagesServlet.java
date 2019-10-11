package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowAllPackagesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="all_packages.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}