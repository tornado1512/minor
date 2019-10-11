package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;
import java.util.*;
public class NationalServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		String nextPage="view_packages.jsp	";
		//int id=request.getParameter("id");
		System.out.println(nextPage);
		ArrayList<Packagee> packages=Packagee.collectNPack();
		System.out.println(packages.size()+"aaaaaaaa");
		for(Packagee pac:packages){
			System.out.println(pac.getPackageName()+"pppp");
			}
		session.setAttribute("packages",packages);
		request.getRequestDispatcher("view_packages.jsp").forward(request,response);
	}
}