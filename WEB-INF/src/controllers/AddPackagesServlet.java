package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AddPackagesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage="add_packages.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}