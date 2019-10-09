package models;

import java.sql.*;

public class Packagee{
	private Integer packageId;
	private String packageName;
	private TypeCategory typeCategoryId;
	private Integer days;
	private Integer cost;
	private String startEndPoint;
	private Accomodation accomodationId;
	private String food;
	private String placeVisit;
	private String transport;
	private String packageDetails;
	private String contactNo;

	public Packagee(){

	}
	public Packagee(Integer packageId,String packageName,TypeCategory typeCategoryId,Integer days,Integer cost,String startEndPoint,Accomodation accomodationId, String food,String placeVisit,String transport,String packageDetails,String contactNo){
		this.packageId=packageId;
		this.packageName=packageName;
		this.typeCategoryId=typeCategoryId;
		this.days=days;
		this.cost=cost;
		this.startEndPoint=startEndPoint;
		this.accomodationId=accomodationId;
		this.food=food;
		this.placeVisit=placeVisit;
		this.transport=transport;
		this.packageDetails=packageDetails;
		this.contactNo=contactNo;
	}

	public boolean saveRecord(){
		boolean flag=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into package (package_name,type_category_id,days,cost,start_end_point,accomodation_id,food,place_visit,transport,package_details,contact_no ) value(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,packageName); 
			pst.setInt(2,typeCategoryId.getTypeCategoryId());
			//pst.setInt(3,typeCategoryId.getPackageCategoryId());
			pst.setInt(3, days); 
			pst.setInt(4,cost);
			pst.setString(5,startEndPoint);
			pst.setInt(6,accomodationId.getAccomodationId());
			pst.setString(7,food);
			pst.setString(8,placeVisit);
			pst.setString(9, transport);
			pst.setString(10,packageDetails);
			pst.setString(11,contactNo);
			int i=pst.executeUpdate();
			if(i==1){
				flag=true;
			}
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return flag; 
	}

	public void setPackageId(Integer packageId){
		this.packageId=packageId;
	}
	public Integer getPackageId(){
		return packageId;
	}
	public void setPackageName(String packageName){
		this.packageName=packageName;
	}
	public String getPackageName(){
		return packageName;
	}
	public void setTypeCategoryId(TypeCategory typeCategoryId){
		this.typeCategoryId=typeCategoryId;
	}
	public TypeCategory  getTypeCategoryId(){
		return typeCategoryId;
	}
	public void setDays(Integer days){
		this.days=days;
	}
	public Integer getDays(){
		return days;
	}
	public void setCost(Integer cost){
		this.cost=cost;
	}
	public Integer getCost(){
		return cost;
	}
	public void setStartEndPoint(String startEndPoint){
		this.startEndPoint=startEndPoint;
	}
	public String getStartEndPoint(){
		return startEndPoint;
	}
	public void setAccomodationId(Accomodation accomodationId){
		this.accomodationId=accomodationId;
	}
	public Accomodation getAccomodationId(){
		return accomodationId;
	}
	public void setFood(String food){
		this.food=food;
	}
	public String getFood(){
		return food;
	}
	public void setPlaceVisit(String placeVisit){
		this.placeVisit=placeVisit;
	}
	public String getPlaceVisit(){
		return placeVisit;
	}
	public void setTransport(String transport){
		this.transport=transport;
	}
	public String getTransport(){
		return transport;
	}
	public void setPackageDetails(String packageDetails){
		this.packageDetails=packageDetails;
	}
	public String getPackageDetails(){
		return packageDetails;
	}
	public void setContactNo(String contactNo){
		this.contactNo=contactNo;
	}
	public String getContactNo(){
		return contactNo;
	}
}