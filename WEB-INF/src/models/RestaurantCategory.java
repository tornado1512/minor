package models;

public class RestaurantCategory{
	private Integer restaurantCategoryId;
	private Restaurant restaurantId;
	private Category categoryId;

	public void setRestaurantCategory(Integer restaurantCategoryId){
			this.restaurantCategoryId=restaurantCategoryId;
	}
	public Integer getRestaurantCategory(){
			return restaurantCategoryId;
	}

	public void setRestaurantId(Restaurant restaurantId){
			this.restaurantId=restaurantId;
	}
	public Restaurant getRestaurantId(){
			return restaurantId;
	}

	public void setCategoryId(Category categoryId){
			this.categoryId=categoryId;
	}
	public Category getCategoryId(){
			return categoryId;
	}
}