package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * annotation jpa
 * @author INTI
 *
 */
@Entity(name="produit") //nom de l'entité si requete
@Table(name="produit") //nom de la table
public class Produit implements Serializable{
	
	//champs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProduit")
	private Long idProduit;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="description")
	private String description;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="selectionne")
	private boolean selectionne;
	
	@Column(name="photo")
	private String photo;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Commande> commandes;
	
	@OneToOne(cascade = CascadeType.ALL) //YU Manytoone
	@Column(name="categorie")
	private Categorie categorie ;
	
	//ctor
	public Produit() {
		super();
	}


	public Produit(Long idProduit, String designation, String description, double prix, int quantite,
			boolean selectionne, String photo, List<Commande> commandes, Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
//		this.commandes = commandes;
		this.categorie = categorie;
	}



	public Produit(String designation, String description, double prix, int quantite, boolean selectionne, String photo,
			List<Commande> commandes) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
//		this.commandes = commandes;
		this.categorie = categorie;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public boolean isSelectionne() {
		return selectionne;
	}

	public void setSelectionne(boolean selectionne) {
		this.selectionne = selectionne;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

//	public List<Commande> getCommandes() {
//		return commandes;
//	}
//
//	public void setCommandes(List<Commande> commandes) {
//		this.commandes = commandes;
//	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
	
	
	
}
