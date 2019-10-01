package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ShowUserRegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="user_register.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}