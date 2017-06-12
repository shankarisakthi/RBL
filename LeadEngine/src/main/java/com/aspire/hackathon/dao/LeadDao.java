package com.aspire.hackathon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.aspire.hackathon.bean.Lead;

@Repository
@Qualifier("leadDao")
public class LeadDao implements ILeadDao {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public static final String COLLECTION = "leads";
	
	@Override
	public void create(Lead lead) {
		mongoTemplate.insert(lead);
	}

	@Override
	public List<Lead> findAll() {
		//(List < Lead > ) mongoTemplate.findAll(Lead.class);
		return mongoTemplate.findAll(Lead.class);
	}

}
