/**
 * 
 */
package com.aspire.hackathon.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name = "stl_stall_details")
public class Stall {

	private Integer id;
	private Date dateofStall;
	private String place;
	private List<Employee> stallOwners;

	/**
	 * @return the id
	 */
	@Column(name="stl_id",unique=true,nullable=false)
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
	@Column(name="stl_date",nullable=false)
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
	@Column(name="stl_place",nullable=false)
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
	@OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name="so_stall_owners",joinColumns=@JoinColumn(name="so_stl_id", referencedColumnName="stl_id"),
		      inverseJoinColumns=@JoinColumn(name="so_emp_id", referencedColumnName="emp_id"))
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
