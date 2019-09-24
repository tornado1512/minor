package models;

public class Picture {
	private Integer pictureId;
	private String pictureUrl;

	public void setPictureId(Integer pictureId){
			this.pictureId=pictureId;
	}
	public Integer getPictureId(){
			return pictureId;
	}

	public void setPictureUrl(String pictureUrl){
			this.pictureUrl=pictureUrl;
	}
	public String getPictureUrl(){
			return pictureUrl;
	}
}