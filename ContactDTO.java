package com.customer.dto;


public class ContactDTO {
	
	private Integer custPersonId;
	private String FrndName;
	private String FrndEmailId;
	private String FrndPhoneNumber;
	
	public ContactDTO() {
	}
	public ContactDTO(Integer custPersonId, String custPersonName, String custPersonEmailId,
			String custPhoneNumber) {
		this.custPersonId = custPersonId;
		this.FrndName = custPersonName;
		this.FrndEmailId = custPersonEmailId;
		this.FrndPhoneNumber = custPhoneNumber;
	}
	
	public Integer getCustPersonId() {
		return custPersonId;
	}
	public void setCustPersonId(Integer custPersonId) {
		this.custPersonId = custPersonId;
	}
	public String getFrndName() {
		return FrndName;
	}
	public void setFrndName(String frndName) {
		FrndName = frndName;
	}
	public String getFrndEmailId() {
		return FrndEmailId;
	}
	public void setFrndEmailId(String frndEmailId) {
		FrndEmailId = frndEmailId;
	}
	public String getFrndPhoneNumber() {
		return FrndPhoneNumber;
	}
	public void setFrndPhoneNumber(String frndPhoneNumber) {
		FrndPhoneNumber = frndPhoneNumber;
	}
	@Override
	public String toString() {
		return "ContactDetailsDTO [custPersonId=" + custPersonId + ", CustPersonName=" + FrndName
				+ ", CustPersonEmailId=" + FrndEmailId + ", CustPhoneNumber=" + FrndPhoneNumber + "]";
	}
}
