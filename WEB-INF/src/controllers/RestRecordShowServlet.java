package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;

public class RestRecordShowServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="rest_record_show.jsp";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}