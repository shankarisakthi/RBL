/**
 * 
 */
package com.aspire.hackathon.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shankari.sakthivel
 *
 */
 @Entity
 @Table(name="rol_role")
public class Role {

	private Integer id;
	private String role_name;

	/**
	 * @return the id
	 */
	@Id
	@Column(name="role_id",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the role_name
	 */
	@Column(name="role_name")
	public String getRole_name() {
		return role_name;
	}

	/**
	 * @param role_name
	 *            the role_name to set
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
}
