package io.jsd.training.tp.spring.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsd.training.tp.spring.dao.ClientDAO;
import io.jsd.training.tp.spring.dao.DAOException;
import io.jsd.training.tp.spring.dao.entity.Client;
import io.jsd.training.tp.spring.dao.entity.Reservation;

@Service
public class ClientService {

	private Logger logger = Logger.getLogger(ClientService.class);

	@Autowired
	// Mot cl� pour injecter un bean dans un autre
	@Qualifier("clientJPADAO")
	// Mot cl� pour switcher l'impl�mentation du DAO
	private ClientDAO clientDAO;
	@Autowired
	private ReservationService reservationService;

	@Transactional
	// (propagation=Propagation.MANDATORY)//Transaction par d�faut
	public Client save(Client client) throws ServiceException {
		logger.debug("appel de la m�thode save client" + client.getNom());
		try {
			return clientDAO.save(client);
		} catch (DAOException e) {
			throw new ServiceException("Erreur save Client Service", e);
		}
	}

	@Transactional
	// (propagation=Propagation.MANDATORY)//Transaction par d�faut
	public void remove(Client client) throws ServiceException {
		logger.debug("appel de la m�thode save client" + client.getNom());
		try {

			clientDAO.remove(client);
		} catch (DAOException e) {
			throw new ServiceException("Erreur remove Client Service", e);
		}
	}

	@Transactional
	// (propagation=Propagation.MANDATORY)//Transaction par d�faut
	public void update(Integer id, String nom, String prenom) throws ServiceException {

		try {
			Client clientToUpdate = this.findById(id);
			clientToUpdate.setNom(nom);
			clientToUpdate.setPrenom(prenom);
			if (clientToUpdate != null)
				clientDAO.update(clientToUpdate);
		} catch (DAOException e) {
			throw new ServiceException("Erreur update Client Service", e);
		}
	}

	@Transactional
	// (propagation=Propagation.MANDATORY)//Transaction par d�faut
	public Client removeById(Integer id) throws ServiceException {

		logger.debug("appel de la m�thode removeById client" + id);
		try {
			Client client = this.findById(id);
			if (client != null) {
				List<Reservation> reservations = reservationService.findReservationByClient(id);
				if (!reservations.isEmpty()) {

					for (Reservation res : reservations) {
						logger.debug("appel de la m�thode removeReservationById reservationService " + res);
						System.out.println(res);
						// Pour faire un remove(Client) il faut d'abord faire un
						// findClientByID pour le rattacher au contexte
						reservationService.removeReservationById(res.getId());
					}
					System.out.println("LE IF MARCHE");
				}
				clientDAO.removeById(id);
			}
			return client;
		} catch (DAOException e) {
			throw new ServiceException("Erreur removeById Client Service", e);
		}
	}

	public Client findById(Integer id) throws ServiceException {
		logger.debug("appel de la m�thode findById client" + id);
		try {
			return clientDAO.findById(id);
		} catch (DAOException e) {
			throw new ServiceException("Erreur findById Client Service", e);
		}
	}

	public List<Client> findAll() throws ServiceException {

		try {
			return clientDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findById Client Service", e);
		}
	}

}
