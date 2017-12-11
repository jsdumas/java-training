package io.jsd.training.tp.spring.dao.impl;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.jsd.training.tp.spring.dao.ReservationDAO;
import io.jsd.training.tp.spring.exception.DAOException;
import io.jsd.training.tp.spring.model.Client;
import io.jsd.training.tp.spring.model.Reservation;
import io.jsd.training.tp.spring.model.Voiture;

@Repository
public class ReservationJPADAO extends GenericJPADAO<Reservation, Integer>
		implements ReservationDAO {

	public ReservationJPADAO() {
		super(Reservation.class);
	}
	
	@Override
	public Long countReservation(Integer id) throws DAOException {
		try {
			TypedQuery<Long> query =
					entityManager.createNamedQuery("countReservation", Long.class);
			query.setParameter("clientId", id);
			return query.getSingleResult();
		} catch (PersistenceException e) {
			throw new DAOException("Erreur de countReservation dans ReservationJPADAO", e);
		}
	}
	
	@Override
	public List<Reservation> findReservationByClient(Integer id)
			throws DAOException {
		try {
			TypedQuery<Reservation> query =
					entityManager.createNamedQuery("findReservationByClient", Reservation.class);
				query.setParameter("clientId", id);
			return query.getResultList();
		} catch (PersistenceException e) {
			throw new DAOException("Erreur de findReservation dans ReservationJPADAO", e);
		}
	}

}
