package models;

public class City{
	private Integer cityId;
	private String cityName;

	public void setCityId(Integer cityId){
		this.cityId=cityId;
	}
	public Integer getCityId(){
			return cityId;
	}

	public void setCityName(String cityname){
		this.cityName=cityName;
	}
	public String getCityName(){
			return cityName;
	}


}