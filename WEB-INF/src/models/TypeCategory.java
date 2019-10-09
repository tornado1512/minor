package models;

public class TypeCategory{
	private Integer typeCategoryId;
	private String typeCategory;
	private PackageCategory packageCategoryId;

	public TypeCategory(){

	}
	public TypeCategory( String typeCategory){
		this.typeCategory=typeCategory;
	}

	public TypeCategory(Integer typeCategoryId,String typeCategory,PackageCategory packageCategoryId){
		this.typeCategoryId=typeCategoryId;
		this.typeCategory=typeCategory;
		this.packageCategoryId=packageCategoryId;
	}

	public void setTypeCategoryId(Integer typeCategoryId){
		this.typeCategoryId=typeCategoryId;
	}
	public Integer getTypeCategoryId(){
		return typeCategoryId;
	}
	public void setTypeCategory(String typeCategory){
		this.typeCategory=typeCategory;
	}
	public String  getTypeCategory(){
		return typeCategory;
	}
	public void setPackageCategoryId(PackageCategory  packageCategoryId){
		this.packageCategoryId=packageCategoryId;
	}
	public  PackageCategory getPackageCategoryId(){
		return packageCategoryId;
	}
}