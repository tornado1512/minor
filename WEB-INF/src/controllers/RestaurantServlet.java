
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
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage="";
		String restName="";
		String restAddress="";
		String city="";
		String restContact="";
		Integer ownerId=0;
		String opTime="";
		String clTime="";
		RestRegister restRegister;
		int size=100;
		int i=0;
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
					System.out.println(i);
					i++;
					//System.out.println(fileItem.getFieldName());
					if(fileItem.isFormField()){
						if(fileItem.getFieldName().equals("restName")){
							restName=fileItem.getString();
							System.out.println(restName);
						}
						else if(fileItem.getFieldName().equals("city")){
							city=fileItem.getString();
							System.out.println(city);
							//System.out.println("hello1");
							
						}
						else if(fileItem.getFieldName().equals("restAddress")){
							restAddress=fileItem.getString();
							System.out.println(restAddress);
							//System.out.println("hello3");
						}
						else if(fileItem.getFieldName().equals("restContact")){
							restContact=fileItem.getString();
							System.out.println(restContact);
						}
						else if(fileItem.getFieldName().equals("ownerId")){
							ownerId=Integer.parseInt(fileItem.getString());
							System.out.println(ownerId+"`````````");
						}
						else if(fileItem.getFieldName().equals("optime")){
							 opTime=fileItem.getString();
							 System.out.println(opTime);
						}else{
							 clTime=fileItem.getString();
							 System.out.println(clTime);
							 //clSystem.out.println("hello4");
						}
						//restRegister=new RestRegister(restName,restAddress,restContact,ownerId,new City(city),opTime,clTime);
						//restRegister.saveRecord();
					}
					else{
						File file= new File (realPath,fileItem.getName());
						try{
							fileItem.write(file);
							pics[i]=file.getAbsolutePath();
							System.out.println(file.getAbsolutePath());
							//RestPic rp= new RestPic(file.getAbsolutePath(),restRegister);
							i++;
						}catch (Exception e){
							e.printStackTrace();
						}
					
					}
					
					
					}
					restRegister=new RestRegister(restName,restAddress,restContact,ownerId,new City(city),opTime,clTime);
					restRegister.saveRecord();
					
					//size=i;
					//for(int j=0;j<size;j++){
						//RestPic rp=new RestPic(pics[j],restRegister);
					//}
				}catch(FileUploadException e){
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

		//System.out.println(flag+" ~~~~~~ "+nextPage);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}