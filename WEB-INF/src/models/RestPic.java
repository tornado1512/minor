package models;
import java.sql.*;
public class RestPic {
	private Integer restPicId;
	private String picPath;
	private RestRegister restRegisterId;

	
	public RestPic(String picPath,RestRegister restRegisterId){
		this.picPath=picPath;
		this.restRegisterId=restRegisterId;
	}
	
	public void savePics(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into rest_pics(pic_path,rest_register_id) value(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,picPath); 
			pst.setInt(2,restRegisterId.getRestRegisterId()); 
			int i=pst.executeUpdate();
			con.close();
		}
		catch (ClassNotFoundException |SQLException e){
			e.printStackTrace();
		}
	}
	public void setRestPicId(Integer restPicId){
		this.restPicId=restPicId;
	}
	public Integer getRestPicId(){
		return restPicId;
	}

	public void setPicPath(String picPath){
		this.picPath = picPath;
	}
	public String getPicPath(){
		return picPath;
	}
	public void setRestRegisterId(RestRegister restRegisterId){
		this.restRegisterId= restRegisterId;
	}
	public RestRegister getRestRegisterId(){
		return restRegisterId;
	}
}