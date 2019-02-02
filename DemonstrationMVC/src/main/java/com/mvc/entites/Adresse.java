package com.mvc.entites;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Adresse {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAdresse;
	private String codePostal ;
	private String ville ;
	@ManyToOne
    private Personne personne ;
	
	
	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Adresse(String codePostal, String ville) {
		super();
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	
	
	
	
	
	

}
