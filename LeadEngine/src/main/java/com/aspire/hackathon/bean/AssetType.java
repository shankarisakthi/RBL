/**
 * 
 */
package com.aspire.hackathon.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name="asset_type")
public class AssetType {

	private Integer id;
	private String assetType;
	/**
	 * @return the id
	 */
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
	 * @return the assetType
	 */
	public String getAssetType() {
		return assetType;
	}
	/**
	 * @param assetType the assetType to set
	 */
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
}
