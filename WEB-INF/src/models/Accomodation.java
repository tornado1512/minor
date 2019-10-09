package models;

public class Accomodation{
	private Integer accomodationId;
	private String accomodationName;
	private String address;
	private String accomodationPicPath;

	public Accomodation(){

	}
	public Accomodation(String accomodationName){
		this.accomodationName=accomodationName;
	}

	public Accomodation(Integer accomodationId,String accomodationName,String address,String accomodationPicPath){
		this. accomodationId= accomodationId;
		this.accomodationName=accomodationName;
		this.address=address;
		this.accomodationPicPath=accomodationPicPath;
	}

	public void setAccomodationId(Integer accomodationId){
		this. accomodationId= accomodationId;
	}
	public Integer getAccomodationId(){
		return accomodationId;
	}
	public void setAccomodationName(String accomodationName){
		this. accomodationName=accomodationName;
	}
	public String getAccomodationName(){
		return accomodationName;
	}
	public void setAddress(String address){
		this. address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setAccomodationPicPath(String accomodationPicPath){
		this.accomodationPicPath=accomodationPicPath;
	}
	public String getAccompodationPicPath(){
		return accomodationPicPath;
	}
}