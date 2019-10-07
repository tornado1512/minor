package models;

public class TypeCategory{
	private Integer typeCategoryId;
	private String typeName;
	private PackageCategory packageCategoryId;

	public TypeCategory(){

	}

	public TypeCategory(Integer typeCategoryId,String typeName,PackageCategory packageCategoryId){
		this.typeCategoryId=typeCategoryId;
		this.typeName=typeName;
		this.packageCategoryId=packageCategoryId;
	}

	public void setTypeCategoryId(Integer typeCategoryId){
		this.typeCategoryId=typeCategoryId;
	}
	public Integer getTypeCategoryId(){
		return typeCategoryId;
	}
	public void setTypeName(String typeName){
		this.typeName=typeName;
	}
	public String  getTypeName(){
		return typeName;
	}
	public void setPackageCategoryId(PackageCategory  packageCategoryId){
		this.packageCategoryId=packageCategoryId;
	}
	public  PackageCategory getPackageCategoryId(){
		return packageCategoryId;
	}
}