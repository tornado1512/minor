package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowAdminLoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="admin_login.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}