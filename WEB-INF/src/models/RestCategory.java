package models;

import java.sql.*;

public class RestCategory{
	private Integer restaurantCategoryId;
	private RestRegister restRegisterId;
	private Category categoryId;

	public RestCategory(RestRegister restRegisterId,Category categoryId){
		this.restRegisterId=restRegisterId;
		this.categoryId=categoryId;
	}

	public boolean save(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into rest_categories(rest_register_id,category_id) value(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,restRegisterId.getRestRegisterId());
			System.out.println(categoryId.getCategoryId());
			pst.setInt(2,categoryId.getCategoryId());
			pst.executeUpdate();
			con.close();
		}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
		}
		return true;
	}

	public void setRestaurantCategoryId(Integer restaurantCategoryId){
			this.restaurantCategoryId=restaurantCategoryId;
	}
	public Integer getRestaurantCategoryId(){
			return restaurantCategoryId;
	}

	public void setRestRegistertId(RestRegister restRegisterId){
			this.restRegisterId=restRegisterId;
	}
	public RestRegister getRestRegisterId(){
			return restRegisterId;
	}

	public void setCategoryId(Category categoryId){
			this.categoryId=categoryId;
	}
	public Category getCategoryId(){
			return categoryId;
	}
}