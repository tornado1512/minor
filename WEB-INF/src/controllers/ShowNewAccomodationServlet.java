package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ShowNewAccomodationServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="new_accomodation.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}