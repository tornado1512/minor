package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;

public class PackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="";
		
		String pacName = request.getParameter("pacname");
		String category = request.getParameter("category");
		String typeCategory = request.getParameter("typecategory");
		String accomodation = request.getParameter("accomodation");
		String days = request.getParameter("days");
		String cost=request.getParameter("cost");
		String sePoint=request.getParameter("sepoint");
		String food = request.getParameter("food");
		String placeVisit = request.getParameter("plcevisit");
		String transport= request.getParameter("transport");
		String details =request.getParameter("details");
		String contactNo = request.getParameter("number");

		Packagee packagee = new Packagee(pacName,category,typeCategory,accomodation,days,cost,sePoint,food ,placeVisit,transport, details,contactNo );
		if(packagee.saveRecord()){
			nextPage="success_add_package.jsp";
		}
		else{
			nextPage="new_package.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}
