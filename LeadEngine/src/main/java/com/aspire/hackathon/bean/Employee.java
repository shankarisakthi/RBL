/**
 * 
 */
package com.aspire.hackathon.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name="emp_employee")
public class Employee {

	private Long id;
	private String empName;
	private String empCode;
	private Role roles;
	private String managerId;
	private Integer mobileNum;
	private String emailId;

	/**
	 * @return the id
	 */
	@Column(name="emp_id",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the empName
	 */
	@Column(name="emp_name",nullable=false)
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empCode
	 */
	@Column(name="emp_code",nullable=false)
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @param empCode
	 *            the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @return the roles
	 */
	@OneToOne
	@JoinColumn(name="role_id")
	public Role getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(Role roles) {
		this.roles = roles;
	}

	/**
	 * @return the managerId
	 */
	@Column(name="manager_id")
	public String getManagerId() {
		return managerId;
	}

	/**
	 * @param managerId
	 *            the managerId to set
	 */
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	/**
	 * @return the mobileNum
	 */
	@Column(name="mobile_no")
	public Integer getMobileNum() {
		return mobileNum;
	}

	/**
	 * @param mobileNum the mobileNum to set
	 */
	public void setMobileNum(Integer mobileNum) {
		this.mobileNum = mobileNum;
	}

	/**
	 * @return the emailId
	 */
	@Column(name="email_id")
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
