package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name="categorie") //nom de l'entité si requete
@Table(name="categorie") //nom de la table
public class Categorie implements Serializable{

	 //champs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCategorie")
	private Long idCategorie;
    
    @Column(name="nomCategorie")
	private String nomCategorie;
    
    
    @Column(name="photo")
	private byte[] photo;
    
    @Column(name="description")
	private String description;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produit> produits;

    //ctor
	public Categorie(Long idCategorie, String nomCategorie, byte[] photo, String description, List<Produit> produits) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
		this.produits = produits;
	}

	public Categorie(String nomCategorie, byte[] photo, String description, List<Produit> produits) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
		this.produits = produits;
	}

	public Categorie() {
		super();
	}
	
	
	//getter et setter
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
    
    
}
