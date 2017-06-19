package com.aspire.hackathon.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author shankari.sakthivel
 *
 */
@Entity
@Table(name="lead_assets")
public class LeadAssets {

	private Integer id;
	private Lead lead;
	private AssetType assetType;
	
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
	 * @return the lead
	 */
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lead_id")
	public Lead getLead() {
		return lead;
	}
	/**
	 * @param lead the lead to set
	 */
	public void setLead(Lead lead) {
		this.lead = lead;
	}
	/**
	 * @return the assetType
	 */
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id")
	public AssetType getAssetType() {
		return assetType;
	}
	/**
	 * @param assetType the assetType to set
	 */
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	
}
