package io.jsd.training.webapp.realestatemanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.jsd.training.webapp.realestatemanager.dao.entity.Quartier;

public interface QuartierDAO extends JpaRepository<Quartier, Integer> {
	
	@Query("SELECT q FROM Quartier q WHERE q.libelleQuartier = :libelleQuartier")
	Quartier findByLibelleQuartier(@Param("libelleQuartier") String libelleQuartier);
	
	@Query("SELECT q FROM Quartier q WHERE q.commune.nomCommune = :nomCommune")
	List<Quartier> findByCommmune(@Param("nomCommune") String nomCommune);

}
