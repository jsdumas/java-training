package io.jsd.training.webapp.trainingcenter.dao.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Stagiaire extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String email;
	private Integer nbJourDispo;
//	@OneToMany(mappedBy="stagiaire")
//	private List<Evaluation> evaluations;

	
	public Stagiaire() {
		// TODO Auto-generated constructor stub
	}


	public Stagiaire(Integer id, Date dateDeNaissance, String email,
			Integer nbJourDispo) {
		super();
		this.id = id;
		this.dateDeNaissance = dateDeNaissance;
		this.email = email;
		this.nbJourDispo = nbJourDispo;
	}


	@Override
	public String toString() {
		return "Stagiaire [id=" + id + ", dateDeNaissance=" + dateDeNaissance
				+ ", email=" + email + ", nbJourDispo=" + nbJourDispo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dateDeNaissance == null) ? 0 : dateDeNaissance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stagiaire other = (Stagiaire) obj;
		if (dateDeNaissance == null) {
			if (other.dateDeNaissance != null)
				return false;
		} else if (!dateDeNaissance.equals(other.dateDeNaissance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getNbJourDispo() {
		return nbJourDispo;
	}


	public void setNbJourDispo(Integer nbJourDispo) {
		this.nbJourDispo = nbJourDispo;
	}

}
