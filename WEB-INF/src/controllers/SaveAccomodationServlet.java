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

public class SaveAccomodationServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("inside........");
		String aName="";
		String address="";
		String city="";
		String pic="";
		String [] pics =new String[100];
		HttpSession session=request.getSession();
		
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif=new DiskFileItemFactory();
			ServletFileUpload sfu=new ServletFileUpload(dfif);
			try{
				List<FileItem> fileItems=sfu.parseRequest(request);
				String realPath=getServletContext().getRealPath("/");
				realPath+="images";
				System.out.println(fileItems.size());
				for(FileItem fileItem:fileItems){
					//System.out.println(fileItem.getFieldName());
					if(fileItem.isFormField()){
						if(fileItem.getFieldName().equals("aname")){
							aName=fileItem.getString();
							System.out.println(aName);
						}
						else if(fileItem.getFieldName().equals("city")){
							city=fileItem.getString();
							System.out.println(city);
							//System.out.println("hello1");
							
						}
						else {
							address=fileItem.getString();
							System.out.println(address);
							//System.out.println("hello3");
						}
					}
					else{
						File file= new File (realPath,fileItem.getName());
						try{
							fileItem.write(file);
							pic=file.getAbsolutePath();
							System.out.println(file.getAbsolutePath());
							//RestPic rp= new RestPic(file.getAbsolutePath(),restRegister);
						}catch (Exception e){
							e.printStackTrace();
						}
					
					}
				}
					Accomodation acc=new Accomodation(aName,new City(city),address,pic);
					acc.saveRecord();
					
			}catch(FileUploadException e){
				e.printStackTrace();
			}

		}

		boolean flag = true;
		
		//System.out.println(flag+" ~~ "+nextPage);

		request.getRequestDispatcher("add_packages.jsp").forward(request,response);
	}
}