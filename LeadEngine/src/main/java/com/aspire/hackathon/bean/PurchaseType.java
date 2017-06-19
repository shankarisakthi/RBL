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
@Table(name = "purchase_type")
public class PurchaseType {
	private Integer id;
	private String purchaseType;

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
	 * @return the purchaseType
	 */
	@Column(name = "purchase_type")
	public String getPurchaseType() {
		return purchaseType;
	}

	/**
	 * @param purchaseType
	 *            the purchaseType to set
	 */
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
}
