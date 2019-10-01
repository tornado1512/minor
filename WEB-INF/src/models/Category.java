package models;

import java.sql.*;

public class Category{
	private Integer categoryId;
	private String categoryName;
	
	public Category(String categoryName){
		this.categoryName=categoryName;
	}

	
	public void setCategoryId(Integer categoryId){
			this.categoryId=categoryId;
	}
	
	public Integer getCategoryId(){
		try{
			System.out.println("inside categ"+categoryName);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select category_id from categories where category_name=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,categoryName);
			ResultSet rst=pst.executeQuery();
			rst.next();
			categoryId=rst.getInt(1);
		System.out.println("inside categ"+categoryId);
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();		
		}
		return categoryId;
	}


	public void setCategoryName(String categoryName){
			this.categoryName=categoryName;
	}
	public String getCategoryName(){
			return categoryName;
	}
}