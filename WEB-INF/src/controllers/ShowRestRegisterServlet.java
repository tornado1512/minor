package controllers;

import javax.servlet.http.*;
import javax.servlet.*;

import java.util.*;
import java.io.*;

import models.*;

public class ShowRestRegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        String city = request.getParameter("city");

		City ct = new City(city);

		ArrayList<RestRegister> rests=RestRegister.collectRest(ct);
		request.setAttribute("rests",rests);
		request.getRequestDispatcher("rest_record.jsp").forward(request,response);
	}
}