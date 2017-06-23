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
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name = "ldt_lead_details")
public class Lead {

	private Long id;
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
	private Set<AssetTypes> assets;
	private Set<PurchaseTypes> purchaseTypes;
	private Set<HobbiesTypes> hobbies;
	private Stall stall;
	private Employee emp;

	/**
	 * 
	 * @return
	 */
	@Column(name = "ldt_lead_name")
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
	@Column(name = "ldt_mobile_number")
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
	@Column(name = "ldt_email_id")
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "ldt_id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the leadId
	 */
	@Column(name = "ldt_lead_id", unique = true, nullable = false)
	public String getLeadId() {
		return leadId;
	}

	/**
	 * @param leadId
	 *            the leadId to set
	 */
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	/**
	 * @return the dob
	 */
	@Column(name = "ldt_date_of_birth")
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	@Column(name = "ldt_gender")
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the isMarried
	 */
	@Column(name = "ldt_maritial_status")
	public Boolean getIsMarried() {
		return isMarried;
	}

	/**
	 * @param isMarried
	 *            the isMarried to set
	 */
	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	/**
	 * @return the familyIncome
	 */
	@Column(name = "ldt_family_income")
	public Integer getFamilyIncome() {
		return familyIncome;
	}

	/**
	 * @param familyIncome
	 *            the familyIncome to set
	 */
	public void setFamilyIncome(Integer familyIncome) {
		this.familyIncome = familyIncome;
	}

	/**
	 * @return the noOfEarnings
	 */
	@Column(name = "ldt_no_of_earnings")
	public Integer getNoOfEarnings() {
		return noOfEarnings;
	}

	/**
	 * @param noOfEarnings
	 *            the noOfEarnings to set
	 */
	public void setNoOfEarnings(Integer noOfEarnings) {
		this.noOfEarnings = noOfEarnings;
	}

	/**
	 * @return the empType
	 */
	@Column(name = "ldt_employment_type")
	public String getEmpType() {
		return empType;
	}

	/**
	 * @param empType
	 *            the empType to set
	 */
	public void setEmpType(String empType) {
		this.empType = empType;
	}

	/**
	 * @return the savingsPercentage
	 */
	@Column(name = "ldt_savings_percentage")
	public Integer getSavingsPercentage() {
		return savingsPercentage;
	}

	/**
	 * @param savingsPercentage
	 *            the savingsPercentage to set
	 */
	public void setSavingsPercentage(Integer savingsPercentage) {
		this.savingsPercentage = savingsPercentage;
	}

	/**
	 * @return the assets
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name="lat_lead_assets",joinColumns=@JoinColumn(name="lat_lead_id", referencedColumnName="ldt_id"),
		      inverseJoinColumns=@JoinColumn(name="lat_asset_id", referencedColumnName="ast_type_id"))
	public Set<AssetTypes> getAssets() {
		return assets;
	}

	/**
	 * @param assets
	 *            the assets to set
	 */
	public void setAssets(Set<AssetTypes> assets) {
		this.assets = assets;
	}

	/**
	 * @return the purchaseTypes
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name="lpt_lead_purchase_type",joinColumns=@JoinColumn(name="lpt_lead_id", referencedColumnName="ldt_id"),
		      inverseJoinColumns=@JoinColumn(name="lpt_purchase_type_id", referencedColumnName="pct_id"))
	public Set<PurchaseTypes> getPurchaseTypes() {
		return purchaseTypes;
	}

	/**
	 * @param purchaseTypes
	 *            the purchaseTypes to set
	 */
	public void setPurchaseTypes(Set<PurchaseTypes> purchaseTypes) {
		this.purchaseTypes = purchaseTypes;
	}

	/**
	 * @return the hobbies
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name="lht_lead_hobbies",joinColumns=@JoinColumn(name="lht_lead_id", referencedColumnName="ldt_id"),
		      inverseJoinColumns=@JoinColumn(name="lht_hobby_id", referencedColumnName="hty_type_id"))
	public Set<HobbiesTypes> getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies
	 *            the hobbies to set
	 */
	public void setHobbies(Set<HobbiesTypes> hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the stallId
	 */
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "stl_id")
	public Stall getStallId() {
		return stall;
	}

	/**
	 * @param stallId
	 *            the stallId to set
	 */
	public void setStallId(Stall stallId) {
		this.stall = stallId;
	}

	/**
	 * @return the emp
	 */
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id")
	public Employee getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
