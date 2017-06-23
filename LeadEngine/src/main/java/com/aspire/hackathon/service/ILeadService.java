package com.aspire.hackathon.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.aspire.hackathon.bean.Employee;
import com.aspire.hackathon.bean.Lead;

public interface ILeadService {
	
	public void create(Lead lead);
	
	public List<Lead> findAll();
	
	public Page<Lead> findLeadByEmployee(Employee emp,PageRequest pageRequest);
	
	public Long countLeadsByEmp(Employee emp);
}