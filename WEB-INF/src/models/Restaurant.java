package models;

public class Restaurant{
	private Integer restaurantId;
	private RegisterOwner ownerId;
	private String restaurantName;
	private String restaurantAddress;
	private String restaurantContact;
	private City cityId;
	private Picture pictureId;
	private Integer restaurantTimimg;
	private Integer restaurantRating;


	public void setRestaurantId(Integer restaurantId){
			this.restaurantId=restaurantId;
	}
	public Integer getRestaurantId(){
		return restaurantId;
	}

	public void setOwnerId(RegisterOwner ownerId){
			this.ownerId=ownerId;
	}
	public RegisterOwner getOwnerId(){
		return ownerId;
	}
	
	public void setRestaurantName(String restaurantName){
		this.restaurantName=restaurantName;
	}
	public String getRestaurantName(){
		return restaurantName;
	}

	public void setRestaurantAddress(String restaurantAddress){
		this.restaurantAddress=restaurantAddress;
	}
	public String getRestaurantAddress(){
		return restaurantAddress;
	}

	public void setRestaurantContact(String restaurantContact){
		this.restaurantContact=restaurantContact;
	}
	public String getRestaurantContact(){
		return restaurantContact;
	}

	public void setCityId(City cityId){
		this.cityId=cityId;
	}
	public City getCityId(){
		return cityId;
	}

	public void setPictureId( Picture pictureId){
		this.pictureId=pictureId;
	}
	public  Picture getPictureId(){
		return pictureId;
	}

	public void setRestaurantTimimg(Integer restaurantTimimg){
		this.restaurantTimimg=restaurantTimimg;
	}
	public Integer getRestaurantTimimg(){
		return restaurantTimimg;
	}

	public void setRestaurantRating(Integer restaurantRating){
		this.restaurantRating=restaurantRating;
	}
	public Integer getRestaurantRating(){
		return restaurantTimimg;
	}
}