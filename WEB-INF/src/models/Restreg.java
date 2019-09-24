 package models;
import java.sql.*;
import org.jasypt.util.password.StrongPasswordEncryptor;
public class Restreg{
    private Integer restId;
    private String restname;
    private String restaddress;
    private String restcontact;

    public Restreg(){

    }
	public Restreg(String restname ,String restaddress, String restcontact){
		this.restname=restname;
        this.restaddress=restaddress;
        this.restcontact=restcontact;
    }
    public Restreg(Integer restId ,String restname ,String restaddress, String restcontact){
        this.restId=restId;
        this.restname=restname;
        this.restaddress=restaddress;
        this.restcontact=restcontact;
    }

    public boolean saveRecord(){
       boolean flag=false;
		try{

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into user (rest_name,rest_address,rest_contact) value(?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,restname); 
			pst.setString(2,restaddress); 
			pst.setString(3,restcontact); 
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

    public void setrestId(Integer restId){
		this.restId=restId;
	} 
	public Integer getrestId(){
		return restId;
	}

    public void setrestname(String restname){
		this.restname=restname;
	} 
	public String getrestname(){
		return restname;
	}

     public void setrestaddress(String restaddress){
		this.restaddress=restaddress;
	} 
	public String getrestaddress(){
		return restaddress;
	}

     public void setrestcontact(String restcontact){
		this.restcontact=restcontact;
	} 
	public String getrestcontact(){
		return restcontact;
	}
}