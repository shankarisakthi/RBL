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
@Table(name = "hobbies_type")
public class HobbiesType {

	private Integer id;
	private String hobbiesType;

	/**
	 * @return the id
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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
	 * @return the hobbiesType
	 */
	@Column(name = "hobbies_type")
	public String getHobbiesType() {
		return hobbiesType;
	}

	/**
	 * @param hobbiesType
	 *            the hobbiesType to set
	 */
	public void setHobbiesType(String hobbiesType) {
		this.hobbiesType = hobbiesType;
	}
}
