package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="gestionPanier") //nom de l'entité si requete
@Table(name="gestionPanier") //nom de la table
public class GestionPanier implements Serializable{
	
	//champs
	@ManyToMany(cascade = CascadeType.ALL)
	private List<LigneCommande> ligneCommandes;

	//ctor
	public GestionPanier(List<LigneCommande> ligneCommandes) {
		super();
		this.ligneCommandes = ligneCommandes;
	}

	public GestionPanier() {
		super();
	}

	//getter and setter
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	

}
