package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.ArrayList;
import models.*;

public class FamilyVacationPackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String nextPage="family_vacation.jsp";
		HttpSession session= request.getSession();
		
		ArrayList<Packagee> packages = Packagee.collectFamilyVacationPack();
		for(Packagee pac:packages){
			System.out.println(pac.getPackageName()+"@@@@");
		}
		request.setAttribute("packages",packages);

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}