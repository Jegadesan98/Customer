package com.customer.entity;

import java.util.Objects;

public class Contact{
	private Integer custPersonId;
	private String FrndName;
	private String FrndEmailId;
	private String FrndPhoneNumber;
	
	public Contact() {
	}
	public Contact(Integer custPersonId, String custPersonName, String custPersonEmailId, String custPhoneNumber) {
		this.custPersonId=custPersonId;
		this.FrndName=custPersonName;
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
	public int hashCode() {
		return Objects.hash(FrndEmailId, FrndName, FrndPhoneNumber, custPersonId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(FrndEmailId, other.FrndEmailId)
				&& Objects.equals(FrndName, other.FrndName) && FrndPhoneNumber == other.FrndPhoneNumber
				&& Objects.equals(custPersonId, other.custPersonId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
