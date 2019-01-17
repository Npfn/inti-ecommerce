package com.intiformation.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="ligneCommande") //nom de l'entité si requete
@Table(name="ligneCommande") //nom de la table
//@Inheritance(strategy=InheritanceType.JOINED)
public class LigneCommande implements Serializable{

	//champs de création de la table 
	@EmbeddedId
	private LigneCommandeProduit id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idProduit")
    private Produit produit;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCommande")
    private Commande commande;
	
	//champs
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="prix")
	private int prix;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GestionPanier panier;

	
	//ctor
	public LigneCommande(LigneCommandeProduit id, Produit produit, Commande commande, int quantite, int prix,
			GestionPanier panier) {
		super();
		this.id = id;
		this.produit = produit;
		this.commande = commande;
		this.quantite = quantite;
		this.prix = prix;
		this.panier = panier;
	}

	public LigneCommande(Produit produit, Commande commande, int quantite, int prix, GestionPanier panier) {
		super();
		this.produit = produit;
		this.commande = commande;
		this.quantite = quantite;
		this.prix = prix;
		this.panier = panier;
	}

	public LigneCommande() {
		super();
	}

	//getter et setter
	public LigneCommandeProduit getId() {
		return id;
	}

	public void setId(LigneCommandeProduit id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public GestionPanier getPanier() {
		return panier;
	}

	public void setPanier(GestionPanier panier) {
		this.panier = panier;
	}

	
	
	
}
