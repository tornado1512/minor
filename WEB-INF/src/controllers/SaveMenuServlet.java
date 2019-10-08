package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class SaveMenuServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session=request.getSession();
		String [] prices = request.getParameterValues("price1");
		String [] items = request.getParameterValues("item1");
		System.out.println(prices.length);
		System.out.println(items.length);
		for(String price:prices){
			System.out.println("p:"+price);
		}
		for(String item:items){
			System.out.println("i:"+item);
		}

	}
}