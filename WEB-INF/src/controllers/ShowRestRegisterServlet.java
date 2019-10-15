package controllers;

import javax.servlet.http.*;
import javax.servlet.*;

import java.util.*;
import java.io.*;

import models.*;

public class ShowRestRegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        String city = request.getParameter("city");

		City ct = new City(city);

		ArrayList<RestRegister> rests=RestRegister.collectRest(ct);
		for(RestRegister rest:rests){
			System.out.println(rest.getRestName());
			//System.out.println(rest.getRestName);
		}
		request.setAttribute("rests",rests);
		request.getRequestDispatcher("rest_record.jsp").forward(request,response);
	}
}