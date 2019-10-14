package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import models.User;
import java.io.*;
public class ShowRestRegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        String city = request.getParameter("city");


		ArrayList<Rest> rests=Rest.collectRest(city);
		request.setAttribute("rests",rests);
		request.getRequestDispatcher("rest_record.jsp").forward(request,response);
	}
}