package com.customer.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CustId;
	@Column(name="customername")
	private String Custname;
	@Column(name="customerloc")
	private String CustLoc;
	@Column(name="customeremailid")
	private String CustEmailId;
	@Column(name="customeraadharnum")
	private String CustAadharNum;
	@Column(name="customercontactnum")
	private String CustContactNum;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="custPersonId")
	private List<Contact> ContactDetails;

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

	public List<Contact> getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(List<Contact> contactDetails) {
		ContactDetails = contactDetails;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ContactDetails, CustAadharNum, CustContactNum, CustEmailId, CustId, CustLoc, Custname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(ContactDetails, other.ContactDetails)
				&& Objects.equals(CustAadharNum, other.CustAadharNum)
				&& Objects.equals(CustContactNum, other.CustContactNum)
				&& Objects.equals(CustEmailId, other.CustEmailId) && Objects.equals(CustId, other.CustId)
				&& Objects.equals(CustLoc, other.CustLoc) && Objects.equals(Custname, other.Custname);
	}

	

	
	
	
	
}
