/**
 * 
 */
package com.aspire.hackathon.service;

import org.springframework.data.domain.Page;

import com.aspire.hackathon.bean.Employee;

/**
 * @author shankari.sakthivel
 *
 */
public interface IEmployeeService {

	Page<Employee> findByManager(String id);
}
