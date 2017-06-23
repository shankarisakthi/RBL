/**
 * 
 */
package com.aspire.hackathon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aspire.hackathon.constants.LeadConstants;
import com.aspire.hackathon.service.IEmployeeService;

/**
 * @author shankari.sakthivel
 *
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	@Qualifier(LeadConstants.EMP_SERVICE)
	IEmployeeService employeeService;

	@ResponseBody
	@RequestMapping(value = "/getEmp/{id}", method = RequestMethod.GET)
	public String findEmployees(@PathVariable("id") String ManagerId) {
		return ManagerId;

	}
}
