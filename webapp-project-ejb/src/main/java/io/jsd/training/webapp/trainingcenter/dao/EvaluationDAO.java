package io.jsd.training.webapp.trainingcenter.dao;

import java.util.List;

import io.jsd.training.webapp.trainingcenter.dao.entity.Evaluation;
import io.jsd.training.webapp.trainingcenter.dao.entity.Session;

public interface EvaluationDAO extends GenericDAO<Evaluation, Integer> {
	
	List<Evaluation> findBySession(Session session) throws DAOException;
	void deleteBySession(Session session) throws DAOException;
//	Evaluation findByID(Integer sessionID, Integer stagiaireID) throws DAOException;
}
