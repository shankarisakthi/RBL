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
@Table(name = "asset_type")
public class AssetType {

	private Integer id;
	private String assetType;

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
	 * @return the assetType
	 */
	@Column(name = "asset_type")
	public String getAssetType() {
		return assetType;
	}

	/**
	 * @param assetType
	 *            the assetType to set
	 */
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
}
