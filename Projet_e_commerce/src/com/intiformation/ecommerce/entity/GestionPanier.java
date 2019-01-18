package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="gestionPanier") //nom de l'entité si requete
@Table(name="gestionPanier") //nom de la table
public class GestionPanier implements Serializable{
	
	
	//champs	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idGestionPanier")
	private Long idGestionPanier;
	
	//association
	@OneToMany(mappedBy="panier", cascade = CascadeType.ALL)
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
