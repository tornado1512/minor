package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ShowOwnerLoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="owner_login.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}