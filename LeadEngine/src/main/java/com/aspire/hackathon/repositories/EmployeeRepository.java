/**
 * 
 */
package com.aspire.hackathon.repositories;

import org.springframework.data.domain.Page;

import com.aspire.hackathon.bean.Employee;

/**
 * @author shankari.sakthivel
 *
 */
public interface EmployeeRepository extends BaseRepository<Employee, Long> {

	Page<Employee> findByManagerId(String id);
}
