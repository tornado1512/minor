package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import models.Restreg;

public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        String nextPage=" ";

		HttpSession session=request.getSession();
		String restname = request.getParameter("resname");
		String restaddress = request.getParameter("resaddres");
		String restcontact = request.getParameter("rescont");
		

		boolean flag = true;
		String errorMessage = "";

		if(restname.length()<3){
			flag = false;
			errorMessage = errorMessage + "Name must be at least 3 characters length<br />";
		}


		int addressLength = restaddress.length(); 
		if(addressLength<6){
			flag = false;
			errorMessage = errorMessage + "Adress must be at least 6 charcters<br />";
		}

		int ContactLength = restcontact.length(); 
		if(ContactLength==10){
			flag = false;
			errorMessage = errorMessage + "contact no. must be at 10 numeric<br/>";
		}
		Restreg restreg=new Restreg(restname ,restaddress,restcontact);
		if(flag){
			if(user.saveRecord()){
				nextPage="home.jsp";
			}
		}else{
			request.setAttribute("err_msg",errorMessage);
		}

		System.out.println(flag+" ~~~~~~ "+nextPage);

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}