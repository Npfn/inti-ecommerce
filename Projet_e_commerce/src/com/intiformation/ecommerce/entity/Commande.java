package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="commande") //nom de l'entité si requete
@Table(name="commande") //nom de la table
public class Commande implements Serializable{

	//champs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCommande")
	private Long idCommande;
	
	@Column(name="dateCommande")
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Produit> produits;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Client client;
	
	@OneToMany(mappedBy="commande")
	private List<LigneCommande> ligneCommandes;

	//ctor
	public Commande(Long idCommande, Date dateCommande, List<Produit> produits, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.produits = produits;
		this.client = client;
	}

	public Commande(Date dateCommande, List<Produit> produits, Client client) {
		super();
		this.dateCommande = dateCommande;
		this.produits = produits;
		this.client = client;
	}

	public Commande() {
		super();
	}

	//getter and setter
	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	
	
	
	
		
}
