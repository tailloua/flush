package com.mvc.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private int idPersonne ;
	@Column
	private String nom ;
	@OneToMany(mappedBy = "personne")
	private List<Adresse> adresse = new ArrayList<Adresse>();
	
	
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public List<Adresse> getAdresse() {
		return adresse;
	}
	public void setAdresse(List<Adresse> adresse) {
		this.adresse = adresse;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
