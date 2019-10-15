package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import models.*;

public class HoneymoonPackageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		String nextPage="honeymoon_package.jsp";

		ArrayList<Packagee> pacs=Packagee.collectHoneymoonPack();
		for(Packagee pac:pacs){
			System.out.println(pac.getPackageName()+"package@@");
		}	
		session.setAttribute("packages",pacs);
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}