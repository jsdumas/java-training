package io.jsd.training.tp.spring.dao;

import java.util.List;

public interface GenericDAO<T, K> {
	
	T save(T t) throws DAOException;
	T update(T t) throws DAOException;
	void remove(T t) throws DAOException;
	void removeById(K id) throws DAOException;
	T findById(K id) throws DAOException;
	List<T> findAll() throws DAOException;

}
