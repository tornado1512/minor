package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.sql.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import models.*;

import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

public class RestaurantServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage="";
		HttpSession session=request.getSession();
		
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif=new DiskFileItemFactory();
			ServletFileUpload sfu=new ServletFileUpload(dfif);
			try{
				List<FileItem> fileItems=sfu.parseRequest(request);
				String realPath=getServletContext().getRealPath("/");
				for(FileItem fileItem:fileItems){
					if(fileItem.isFormField()){
						if(fileItem.getFieldName().equals("restName")){
							String restName=fileItem.getFieldName();
							System.out.println(request.getParameter(restName));
						}
					}
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}

		}

		boolean flag = true;
		/*String errorMessage = "";

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
			if(restreg.saveRecord()){
				nextPage="home.jsp";
			}
		}else{
			request.setAttribute("err_msg",errorMessage);
		}
		*/

		System.out.println(flag+" ~~~~~~ "+nextPage);

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}