package models;

public class Category{
	private Integer categoryId;
	private String categoryName;

	public void setCategoryId(Integer categoryId){
			this.categoryId=categoryId;
	}
	public Integer getCategoryId(){
			return categoryId;
	}

	public void setCategoryName(String categoryName){
			this.categoryName=categoryName;
	}
	public String getCategoryName(){
			return categoryName;
	}
}