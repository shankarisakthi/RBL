/**
 * 
 */
package com.aspire.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.aspire.hackathon.bean.Employee;
import com.aspire.hackathon.constants.LeadConstants;
import com.aspire.hackathon.repositories.EmployeeRepository;

/**
 * @author shankari.sakthivel
 *
 */
@Service(LeadConstants.EMP_SERVICE)
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository  employeeRepository;
	
	/* (non-Javadoc)
	 * @see com.aspire.hackathon.service.IEmployeeService#findByManager(java.lang.String)
	 */
	@Override
	public Page<Employee> findByManager(String id) {
		return employeeRepository.findByManagerId(id);
	}

}
