package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;
import java.util.*;

public class MyPackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		Integer packageId = Integer.parseInt(request.getParameter("packageId"));
		Packagee packagee=Packagee.collectPackage(packageId);
		ArrayList<String> pics=PackagePic.collectPics(packageId);
		Accomodation accomodation = packagee.getAccomodationId().collectAccomodation();
		
		//System.out.println(packagee.getPackageName()+"-----");
		request.setAttribute("packagee",packagee);
		request.setAttribute("pics",pics);
		request.setAttribute("accomodation",accomodation);

		request.getRequestDispatcher("my_package1.jsp").forward(request,response);
	}
}