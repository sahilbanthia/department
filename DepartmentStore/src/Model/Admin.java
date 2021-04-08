package Model;

import Exception.PhoneNumberException;

public class Admin {
	private String AdminId;
	private String AdminPassword;
	private String AdminName;
	private long phoneNumber;
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		try {
			int len=String.valueOf(phoneNumber).length();
			if(len==10) 
			{
				this.phoneNumber = phoneNumber;
			}
			else 
			{
				throw new PhoneNumberException(phoneNumber);
			}
		}
			catch(PhoneNumberException e) {
				System.out.println(e);
			}	
		
	}

	public Admin() {
		
	}
	
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	

}
