package models;

public class PackageCategory{
	private Integer packageCategoryId;
	private String packageCategory;

	public PackageCategory(){

	}

	public PackageCategory(Integer packageCategoryId,String packageCategory){
		this.packageCategoryId=packageCategoryId;
		this.packageCategory=packageCategory;
	}
	public void setPackageCategoryId(Integer packageCategoryId){
		this.packageCategoryId=packageCategoryId;
	}
	public Integer getPackageCategoryId(){
		return packageCategoryId;
	}
	public void setPackageCategory(String packageCategory){
		this.packageCategory=packageCategory;
	}
	public String getPackageCategory(){
		return packageCategory;
	}
}