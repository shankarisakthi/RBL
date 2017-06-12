package com.aspire.hackathon.service;

import java.util.List;

import com.aspire.hackathon.bean.Lead;

public interface ILeadService {
	
	public void create(Lead lead);
	
	public List<Lead> findAll();
}