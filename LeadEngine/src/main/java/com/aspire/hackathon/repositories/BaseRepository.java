/**
 * 
 */
package com.aspire.hackathon.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.Repository;

/**
 * @author shankari.sakthivel
 *
 */
public interface BaseRepository<T,ID extends Serializable> extends Repository<T, ID> {

	T findOne(ID id);
	
	void save(T entity);
	
	void delete(T entity);
	
	List<T> findAll();
}
