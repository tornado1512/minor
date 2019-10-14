package models;

import java.sql.*;

public class TypeCategory{
	private Integer typeCategoryId;
	private String typeCategory;
	private PackageCategory packageCategoryId;

	public TypeCategory(){

	}
	public TypeCategory( String typeCategory){
		this.typeCategory=typeCategory;
	}
	public TypeCategory(Integer typeCategoryId){
		this.typeCategoryId=typeCategoryId;
	}

	public TypeCategory(String typeCategory,PackageCategory packageCategoryId){
		this.typeCategory=typeCategory;
		this.packageCategoryId=packageCategoryId;
	}

	public void setTypeCategoryId(Integer typeCategoryId){
		this.typeCategoryId=typeCategoryId;
	}
	public Integer getTypeCategoryId(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select type_category_id from type_categories where type_category=? and package_category_id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,typeCategory);
			pst.setInt(2,packageCategoryId.getPackageCategoryId());
			
			ResultSet rst=pst.executeQuery();
			rst.next();
			typeCategoryId=rst.getInt(1);
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();		
		}
		return typeCategoryId;
		
	}
	public void setTypeCategory(String typeCategory){
		this.typeCategory=typeCategory;
	}
	public String  getTypeCategory(){
		return typeCategory;
	}
	public void setPackageCategoryId(PackageCategory  packageCategoryId){
		this.packageCategoryId=packageCategoryId;
	}
	public  PackageCategory getPackageCategoryId(){
		return packageCategoryId;
	}
}