package com.aspire.hackathon.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.aspire.hackathon.dao.LeadDao;

@Document(collection = LeadDao.COLLECTION)
public class Lead {
	
	@Id
	private String id;
	private String name;
	private long mobileNumber;
	private String emailId;
	
	public Lead(String name, long mobileNumber, String emailId) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Name:- " + getName() + ", MobileNumber:- " + getMobileNumber());
        return str.toString();
    }

}
