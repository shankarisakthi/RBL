/**
 * 
 */
package com.aspire.hackathon.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author shankari.sakthivel
 *
 */
public class User {

	private Integer id;
	private String userNmae;
	private String password;
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="id",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userNmae
	 */
	public String getUserNmae() {
		return userNmae;
	}
	/**
	 * @param userNmae the userNmae to set
	 */
	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	private boolean status;
}
