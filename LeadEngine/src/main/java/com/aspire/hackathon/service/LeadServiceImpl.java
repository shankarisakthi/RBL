package com.aspire.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aspire.hackathon.bean.Employee;
import com.aspire.hackathon.bean.Lead;
import com.aspire.hackathon.constants.LeadConstants;
import com.aspire.hackathon.repositories.LeadRepository;

@Service(LeadConstants.LEAD_SERVICE)
public class LeadServiceImpl implements ILeadService {

	@Autowired
	LeadRepository leadRepository;
	
	@Override
	public void create(Lead lead) {
		leadRepository.save(lead);
	}

	@Override
	public List<Lead> findAll() {
		return leadRepository.findAll();
	}

	@Override
	public Page<Lead> findLeadByEmployee(Employee emp,PageRequest pageRequest) {
		return leadRepository.findByEmp(emp,pageRequest);
	}

	@Override
	public Long countLeadsByEmp(Employee emp) {
		return leadRepository.countByEmp(emp);
	}
	
	
	
}
