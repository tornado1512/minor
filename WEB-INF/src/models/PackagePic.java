package models;

import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class PackagePic{
	private Integer packagePicId;
	private String picPath;
	private String picDetails;
	private Packagee packageId;

	public PackagePic(){

	}
	public PackagePic(String picPath,Packagee packageId){
		this.picPath=picPath;
		this.packageId=packageId;
	}

	public void savePics(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into package_pics(pic_path,package_id) value(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			System.out.println(picPath);
			pst.setString(1,picPath); 
			pst.setInt(2,packageId.getPackageId()); 
			int i=pst.executeUpdate();
			con.close();
		}
		catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}

	public void setPackagePicId(Integer packagePicId){
		this.packagePicId=packagePicId;
	}
	public Integer getPackagePicId(){
		return packagePicId;
	}
	public void setPicPath(String picPath){
		this.picPath=picPath;
	}
	public String getPicPath(){
		return picPath;
	}
	public void setPicDetails(String picDetails){
		this.picDetails=picDetails;
	}
	public String getPicDetails(){
		return picDetails;
	}
	public void setPackageId(Packagee packageId){
		this.packageId=packageId;
	}
	public Packagee getPackageId(){
		return packageId;
	}
}