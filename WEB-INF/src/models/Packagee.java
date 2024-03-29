package models;

import java.sql.*;
import java.util.*;

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
	private String dispImg;

	public Packagee(){

	}
	
	public Packagee(String packageName,TypeCategory typeCategoryId,Integer days,Integer cost,String startEndPoint,Accomodation accomodationId, String food,String placeVisit,String transport,String packageDetails,String contactNo,String dispImg){
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
		this.dispImg=dispImg;
	}
	public Packagee(Integer packageId,String packageName,TypeCategory typeCategoryId,Integer days,Integer cost,String startEndPoint,Accomodation accomodationId, String food,String placeVisit,String transport,String packageDetails,String contactNo,String dispImg){
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
		this.dispImg=dispImg;
		
	}

	public static ArrayList<Packagee>collectNPack(){
		ArrayList<Packagee> packages=new ArrayList<Packagee>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select * from packages where type_category_id=1 or type_category_id=2 or type_category_id=3 or type_category_id=4 ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Packagee packagee=new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getInt(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
				packages.add(packagee);
			}
			
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return packages;
	}
	public static ArrayList<Packagee>collectReligiousPack(){
		ArrayList<Packagee> packages=new ArrayList<Packagee>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select * from packages where type_category_id=1 ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Packagee packagee=new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getString(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
				packages.add(packagee);
			}
			
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return packages;
	}
	public static ArrayList<Packagee>collectAdventurePack(){
		ArrayList<Packagee> packages=new ArrayList<Packagee>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select * from packages where type_category_id=2 ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Packagee packagee=new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getString(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
				packages.add(packagee);
			}
			
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return packages;
	}
	public static ArrayList<Packagee> collectFamilyVacationPack(){
		ArrayList<Packagee> packages = new ArrayList<Packagee>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select * from packages where type_category_id=3 ";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rst = pst.executeQuery();
			while(rst.next()){
				Packagee packagee=new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getString(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
				packages.add(packagee);
			}
		}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
		}
		return packages;
	}
	public static ArrayList<Packagee>collectHoneymoonPack(){
		ArrayList<Packagee> packages=new ArrayList<Packagee>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select * from packages where type_category_id=4 ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Packagee packagee=new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getString(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
				packages.add(packagee);
			}
			
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return packages;
	}
	public static Packagee collectPackage(Integer packageId){
		Packagee packagee=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select * from packages  where package_id=? ";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,packageId);
			ResultSet rst=pst.executeQuery();
			rst.next();
			packagee = new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getInt(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
			//Packagee packagee=new Packagee(rst.getInt(1),rst.getString(2),new TypeCategory(rst.getInt(3)),rst.getInt(4),rst.getInt(5),rst.getString(6),new Accomodation(rst.getInt(7)),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();		
		}
		return packagee;
	}
	public boolean saveRecord(){
		boolean flag=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="insert into packages (package_name,type_category_id,days,cost,start_end_point,accomodation_id,food,place_visit,transport,package_details,contact_no,disp_img ) value(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,packageName); 
			pst.setInt(2,typeCategoryId.getTypeCategoryId());
			pst.setInt(3, days); 
			pst.setInt(4,cost);
			pst.setString(5,startEndPoint);
			pst.setInt(6,accomodationId.getAccomodationId());
			pst.setString(7,food);
			pst.setString(8,placeVisit);
			pst.setString(9, transport);
			pst.setString(10,packageDetails);
			pst.setString(11,contactNo);
			System.out.println(dispImg+"inside save ");
			pst.setString(12,dispImg);
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
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor?user=root&password=1234");
			String query="select package_Id from packages where package_name=? ";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,packageName);
			ResultSet rst=pst.executeQuery();
			rst.next();
			packageId=rst.getInt(1);
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();		
		}
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

	public void setDispImg(String dispImg){
		this.dispImg=dispImg;
	}
	public String getDispImg(){
		return dispImg;
	}
}