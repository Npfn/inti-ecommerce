package com.intiformation.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="ligneCommande") //nom de l'entité si requete
@Table(name="ligneCommande") //nom de la table
//@Inheritance(strategy=InheritanceType.JOINED)
public class LigneCommande implements Serializable{

	//champs
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="prix")
	private int prix;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GestionPanier panier;

	public LigneCommande(int quantite, int prix, GestionPanier panier) {
		super();
		this.quantite = quantite;
		this.prix = prix;
		this.panier = panier;
	}

	public LigneCommande() {
		super();
	}
	
	
}
