package com.aspire.hackathon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.aspire.hackathon.bean.Lead;

@Repository
@Qualifier("leadDao")
public class LeadDao implements ILeadDao {

	@Override
	public void create(Lead lead) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Lead> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
