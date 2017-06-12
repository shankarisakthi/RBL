package com.aspire.hackathon.dao;

import java.util.List;

import com.aspire.hackathon.bean.Lead;

public interface ILeadDao {

	public void create(Lead lead);
	
	public List<Lead> findAll();
}
