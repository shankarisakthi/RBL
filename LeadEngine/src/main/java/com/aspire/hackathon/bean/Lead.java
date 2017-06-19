package com.aspire.hackathon.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name = "Lead")
public class Lead {
	
	private String id;
	private String leadId;
	private String name;
	private long mobileNumber;
	private String emailId;
	private Date dob;
	private String gender;
	private Boolean isMarried;
	private Integer familyIncome;
	private Integer noOfEarnings;
	private String empType;
	private Integer savingsPercentage;
	private Set<LeadAssets> assets;
	private Set<LeadPurchaseTypes> purchaseTypes; 
	private Set<LeadHobbies> hobbies;
	
	
	public Lead(String name, long mobileNumber, String emailId) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	/**
	 * 
	 * @return
	 */
	@Column(name="cust_name")
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return
	 */
	@Column(name="mobile_no")
	public long getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * 
	 * @param mobileNumber
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	@Column(name="mail_id")
	public String getEmailId() {
		return emailId;
	}
	
	/**
	 * 
	 * @param emailId
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	/**
	 * 
	 * @return
	 */
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id",unique=true,nullable=false)
	public String getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the leadId
	 */
	@Column(name="lead_id",unique=true,nullable=false)
	public String getLeadId() {
		return leadId;
	}

	/**
	 * @param leadId the leadId to set
	 */
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	/**
	 * @return the dob
	 */
	@Column(name="dob")
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	@Column(name="gender")
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the isMarried
	 */
	@Column(name="isMarried")
	public Boolean getIsMarried() {
		return isMarried;
	}

	/**
	 * @param isMarried the isMarried to set
	 */
	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	/**
	 * @return the familyIncome
	 */
	@Column(name="familyIncome")
	public Integer getFamilyIncome() {
		return familyIncome;
	}

	/**
	 * @param familyIncome the familyIncome to set
	 */
	public void setFamilyIncome(Integer familyIncome) {
		this.familyIncome = familyIncome;
	}

	/**
	 * @return the noOfEarnings
	 */
	@Column(name="noOfEarnings")
	public Integer getNoOfEarnings() {
		return noOfEarnings;
	}

	/**
	 * @param noOfEarnings the noOfEarnings to set
	 */
	public void setNoOfEarnings(Integer noOfEarnings) {
		this.noOfEarnings = noOfEarnings;
	}

	/**
	 * @return the empType
	 */
	@Column(name="empType")
	public String getEmpType() {
		return empType;
	}

	/**
	 * @param empType the empType to set
	 */
	public void setEmpType(String empType) {
		this.empType = empType;
	}

	/**
	 * @return the savingsPercentage
	 */
	@Column(name="savingsPercent")
	public Integer getSavingsPercentage() {
		return savingsPercentage;
	}

	/**
	 * @param savingsPercentage the savingsPercentage to set
	 */
	public void setSavingsPercentage(Integer savingsPercentage) {
		this.savingsPercentage = savingsPercentage;
	}

	/**
	 * @return the assets
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "lead_id")
	public Set<LeadAssets> getAssets() {
		return assets;
	}

	/**
	 * @param assets the assets to set
	 */
	public void setAssets(Set<LeadAssets> assets) {
		this.assets = assets;
	}

	/**
	 * @return the purchaseTypes
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "lead_id")
	public Set<LeadPurchaseTypes> getPurchaseTypes() {
		return purchaseTypes;
	}

	/**
	 * @param purchaseTypes the purchaseTypes to set
	 */
	public void setPurchaseTypes(Set<LeadPurchaseTypes> purchaseTypes) {
		this.purchaseTypes = purchaseTypes;
	}

	/**
	 * @return the hobbies
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "lead_id")
	public Set<LeadHobbies> getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(Set<LeadHobbies> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Name:- " + getName() + ", MobileNumber:- " + getMobileNumber());
        return str.toString();
    }

}
