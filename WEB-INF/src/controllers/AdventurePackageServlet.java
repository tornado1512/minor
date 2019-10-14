package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import models.*;

public class AdventurePackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		String nextPage="adventure_package.jsp";

		ArrayList<Packagee> packages=Packagee.collectAdventurePack();
		//System.out.println(packages.size()+"aaaaaaaa");
		for(Packagee pac:packages){
			System.out.println(pac.getPackageName()+"pppp");
			}
		session.setAttribute("packages",packages);
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}