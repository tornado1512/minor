package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import models.*;

public class ReligiousPackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		String nextPage="religious_package.jsp";

		ArrayList<Packagee> packages=Packagee.collectReligiousPack();
		//System.out.println(packages.size()+"aaaaaaaa");
		for(Packagee pac:packages){
			System.out.println(pac.getPackageName()+"pppp");
			}
		session.setAttribute("packages",packages);
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}