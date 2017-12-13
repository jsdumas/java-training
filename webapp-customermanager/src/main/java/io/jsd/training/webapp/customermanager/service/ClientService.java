package io.jsd.training.webapp.customermanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.webapp.customermanager.dao.ClientDAO;
import io.jsd.training.webapp.customermanager.dao.entity.Client;

@Service
public class ClientService {
	
	@Autowired
	private ClientDAO clientDAO;

	//Le DAO est en transactionnel 
	@Transactional
	public Client save(Client client) {
		return clientDAO.save(client);
	}
	
	public List<Client> findAll(){
		return clientDAO.findAll();
	}
	
	@Secured("ROLE_ADMIN")
	@Transactional
	public void remove(Integer id) {
		clientDAO.delete(id);
	}

	public Client findOne(Integer id) {
		return clientDAO.findOne(id);
	}

}
