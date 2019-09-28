package models;

public class RestaurantFood{
	private Integer restaurantFoodId;
	private RestaurantCategory restaurantCategoryId;
	private Food foodId;
	private Integer foodPrice;

	public void setRestaurantFoodId( Integer restaurantFoodId){
			this.restaurantFoodId=restaurantFoodId;
	}
	public Integer getRestaurantFoodId(){
		return restaurantFoodId;
	}

	public void setRestaurantCategory( RestaurantCategory restaurantCategoryId){
			this.restaurantCategoryId=restaurantCategoryId;
	}
	public RestaurantCategory getRestaurantCategory(){
		return restaurantCategoryId;
	}

	public void setFoodId( Food foodId){
			this.foodId=foodId;
	}
	public Food getFoodId(){
		return foodId;
	}

	public void setFoodPrice( Integer foodPrice){
			this.foodPrice=foodPrice;
	}
	public Integer getFoodPrice(){
		return foodPrice;
	}

}