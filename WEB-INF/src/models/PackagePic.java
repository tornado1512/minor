package models;

public class PackagePic{
	private Integer packagePicId;
	private String picPath;
	private String picDetails;
	private Packagee packageId;

	public PackagePic(){

	}
	public PackagePic(Integer packagePicId,String picPath,String picDetails,Packagee packageId){
		this.packagePicId=packagePicId;
		this.picPath=picPath;
		this.picDetails=picDetails;
		this.packageId=packageId;
	}

	public void setPackagePicId(Integer packagePicId){
		this.packagePicId=packagePicId;
	}
	public Integer getPackagePicId(){
		return packagePicId;
	}
	public void setPicPath(String picPath){
		this.picPath=picPath;
	}
	public String getPicPath(){
		return picPath;
	}
	public void setPicDetails(String picDetails){
		this.picDetails=picDetails;
	}
	public String getPicDetails(){
		return picDetails;
	}
	public void setPackageId(Packagee packageId){
		this.packageId=packageId;
	}
	public Packagee getPackageId(){
		return packageId;
	}
}