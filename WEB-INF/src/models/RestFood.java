package models;

public class RestFood{
	private Integer restaurantFoodId;
	private RestCategory restaurantCategoryId;
	private Food foodId;
	private Integer foodPrice;

	public void setRestaurantFoodId( Integer restaurantFoodId){
			this.restaurantFoodId=restaurantFoodId;
	}
	public Integer getRestaurantFoodId(){
		return restaurantFoodId;
	}

	public void setRestaurantCategoryId( RestCategory restaurantCategoryId){
			this.restaurantCategoryId=restaurantCategoryId;
	}
	public RestCategory getRestaurantCategory(){
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