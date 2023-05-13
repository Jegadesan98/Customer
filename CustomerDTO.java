package com.customer.dto;

import java.util.List;

public class CustomerDTO {

	private Integer CustId;
	private String Custname;
	private String CustLoc;
	private String CustEmailId;
	private String CustAadharNum;
	private String CustContactNum;
	private List<ContactDTO> ContactDetails;
	public Integer getCustId() {
		return CustId;
	}
	public void setCustId(Integer custId) {
		CustId = custId;
	}
	public String getCustname() {
		return Custname;
	}
	public void setCustname(String custname) {
		Custname = custname;
	}
	public String getCustLoc() {
		return CustLoc;
	}
	public void setCustLoc(String custLoc) {
		CustLoc = custLoc;
	}
	public String getCustEmailId() {
		return CustEmailId;
	}
	public void setCustEmailId(String custEmailId) {
		CustEmailId = custEmailId;
	}
	public String getCustAadharNum() {
		return CustAadharNum;
	}
	public void setCustAadharNum(String custAadharNum) {
		CustAadharNum = custAadharNum;
	}
	public String getCustContactNum() {
		return CustContactNum;
	}
	public void setCustContactNum(String custContactNum) {
		CustContactNum = custContactNum;
	}
	public List<ContactDTO> getContactDetails() {
		return ContactDetails;
	}
	public void setContactDetails(List<ContactDTO> contactDetails) {
		ContactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "CustomerDTO [CustId=" + CustId + ", Custname=" + Custname + ", CustLoc=" + CustLoc + ", CustEmailId="
				+ CustEmailId + ", CustAadharNum=" + CustAadharNum + ", CustContactNum=" + CustContactNum
				+ ", ContactDetails=" + ContactDetails + "]";
	}
	
	

	

	
	
	
	
	
	

	
}
