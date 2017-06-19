/**
 * 
 */
package com.aspire.hackathon.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name = "stall_details")
public class Stall {

	private Integer id;
	private Date dateofStall;
	private String place;
	private List<Employee> stallOwners;

	/**
	 * @return the id
	 */
	@Column(name="id",unique=true,nullable=false)
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
	 * @return the dateofStall
	 */
	@Column(name="stall_date",nullable=false)
	public Date getDateofStall() {
		return dateofStall;
	}

	/**
	 * @param dateofStall
	 *            the dateofStall to set
	 */
	public void setDateofStall(Date dateofStall) {
		this.dateofStall = dateofStall;
	}

	/**
	 * @return the place
	 */
	@Column(name="venue",nullable=false)
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the stallOwner
	 */
	@OneToMany
	@JoinColumn(name="id")
	public List<Employee> getStallOwner() {
		return stallOwners;
	}

	/**
	 * @param stallOwner
	 *            the stallOwner to set
	 */
	public void setStallOwner(List<Employee> stallOwners) {
		this.stallOwners = stallOwners;
	}
}
