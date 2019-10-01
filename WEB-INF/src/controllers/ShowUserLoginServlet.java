package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ShowUserLoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="user_login.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}