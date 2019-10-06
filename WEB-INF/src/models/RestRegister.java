package models;
import java.sql.*;

import org.jasypt.util.password.StrongPasswordEncryptor;
public class RestRegister{
	private Integer restRegisterId;
	private String restName;
	private String restAddress;
	private String restContact;
	private Integer ownerId;
	private City city; 
	private String opTime;
	private String clTime;
	public RestRegister(){

    }
    public RestRegister(String restName ,String restAddress, String restContact,Integer ownerId,City city,String opTime,String clTime ){
		this.restName=restName;
		this.restAddress=restAddress;
		this.restContact=restContact;
		this.ownerId=ownerId;
		this.city=city;
		this.opTime=opTime;
		this.clTime=clTime;
    }
	 public RestRegister(String restName ,String restAddress, String restContact){
		this.restName=restName;
		this.restAddress=restAddress;
		this.restContact=restContact;
    }
    public boolean saveRecord(){
		boolean flag=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into rest_registers (rest_name,rest_address,rest_contact,owner_id,city_id,opTime,clTime) value(?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,restName); 
			pst.setString(2,restAddress); 
			pst.setString(3,restContact);
			pst.setInt(4,ownerId);
			pst.setInt(5,city.getCityId());
			pst.setString(6,opTime);
			pst.setString(7,clTime);
			int i=pst.executeUpdate();
			if(i==1){
				flag=true;
			}
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return flag; 
    }

    public void setRestRegisterId(Integer restId){
		this.restRegisterId=restRegisterId;
	} 
	public Integer getRestRegisterId(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select rest_register_id from rest_registers where owner_id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,ownerId);
			ResultSet rst=pst.executeQuery();
			rst.next();
			restRegisterId=rst.getInt(1);
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();		
		}
		return restRegisterId;
	}

    public void setRestName(String restName){
		this.restName=restName;
	} 
	public String getRestName(){
		return restName;
	}

     public void setrestaddress(String restaddress){
		this.restAddress=restAddress;
	} 
	public String getAestAddress(){
		return restAddress;
	}

     public void setrestcontact(String restcontact){
		this.restContact=restContact;
	} 
	public String getRestContact(){
		return restContact;
	}
}	