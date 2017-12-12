package io.jsd.training.webapp.realestatemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import io.jsd.training.webapp.realestatemanager.dao.IndividuDAO;
import io.jsd.training.webapp.realestatemanager.dao.entity.Individu;
import io.jsd.training.webapp.realestatemanager.dao.entity.Logement;
import io.jsd.training.webapp.realestatemanager.exception.ServiceException;

@Service
public class IndividuService {
	
	@Autowired
	private IndividuDAO individuDAO;
	
	public List<Individu> findAll() throws ServiceException {
		try {
			return individuDAO.findAll();
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de IndividuService findAll", e);
		}
	}
	
	public Individu findOne(Integer id) throws ServiceException{
		try {
			return individuDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur de IndividuService findOne", e);
		}
	} 

}
