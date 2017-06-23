/**
 * 
 */
package com.aspire.hackathon.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aspire.hackathon.bean.Employee;
import com.aspire.hackathon.bean.Lead;

/**
 * @author shankari.sakthivel
 *
 */
public interface LeadRepository extends BaseRepository<Lead, Long> {

	Page<Lead> findByEmp(Employee emp,Pageable pageable);
	
	Long countByEmp(Employee emp);
}
