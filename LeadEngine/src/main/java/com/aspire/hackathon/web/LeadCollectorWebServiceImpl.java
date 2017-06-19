/**
 * 
 */
package com.aspire.hackathon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.aspire.hackathon.constants.LeadConstants;
import com.aspire.hackathon.dto.LeadDTO;
import com.aspire.hackathon.service.ILeadService;

/**
 * @author shankari.sakthivel
 *
 */
public class LeadCollectorWebServiceImpl implements LeadCollectorWebService {

	@Autowired
	@Qualifier(LeadConstants.LEAD_SERVICE)
	ILeadService leadservice;
	
	@Override
	public void readLeadForm(LeadDTO leadInput) {
		// TODO Auto-generated method stub
		
	}

}
