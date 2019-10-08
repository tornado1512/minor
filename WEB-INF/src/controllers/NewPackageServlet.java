package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class NewPackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="new_package.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}