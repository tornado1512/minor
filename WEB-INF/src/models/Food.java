package models;

public class Food{
	private Integer foodId;
	private String foodName;
	private Category categoryId;

	public void setFoodId(Integer foodId){
			this.foodId=foodId;
	}
	public Integer getFoodId(){
			return foodId;
	}

	public void setFoodName(String foodName){
			this.foodName=foodName;
	}
	public String getFoodName(){
			return foodName;
	}

	public void setCategoryId(Category categoryId){
			this.categoryId=categoryId;
	}
	public Category getCategoryId(){
			return categoryId;
	}
}