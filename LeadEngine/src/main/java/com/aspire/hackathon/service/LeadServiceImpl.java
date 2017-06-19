package com.aspire.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.hackathon.bean.Lead;
import com.aspire.hackathon.constants.LeadConstants;
import com.aspire.hackathon.dao.LeadDao;

@Service(LeadConstants.LEAD_SERVICE)
public class LeadServiceImpl implements ILeadService {

	@Autowired
	LeadDao leadDao;
	
	@Override
	public void create(Lead lead) {
		leadDao.create(lead);
	}

	@Override
	public List<Lead> findAll() {
		return leadDao.findAll();
	}
	
}
