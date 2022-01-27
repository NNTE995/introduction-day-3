package day3_Examples;

public class customers {
	
	String id, name, address, phoneNumber, email , founds;
	public customers(String id, String name, String address, String phoneNumber, String email, String founds) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.founds = founds;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFounds() {
		return founds;
	}
	public void setFounds(String founds) {
		this.founds = founds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.getId()+" - Name: "+this.getName()+" - Address: "+this.getAddress()+" - Phone Number: "+this.getPhoneNumber()+" - Mail: "+this.getEmail()+" - Founds: "+this.getFounds();
	}
}