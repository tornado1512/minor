package models;

public class RegisterOwner{
	private Integer ownerId;
	private String ownerName;
	private String email;
	private String password;

	public void setOwnerId(Integer ownerId){
			this.ownerId=ownerId;
	}
	public Integer getOwnerId(){
			return ownerId;
	}

	public void setOwnerName(String ownerName){
			this.ownerName=ownerName;
	}
	public String getOwnerName(){
			return ownerName;
	}

	public void setEmail(String email){
			this.email=email;
	}
	public String getEmail(){
			return email;
	}

	public void setPassword(String password){
			this.password=password;
	}
	public String getPassword(){
			return password;
	}
}