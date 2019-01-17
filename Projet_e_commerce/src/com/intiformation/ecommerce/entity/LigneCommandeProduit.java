package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //annotations pour la classe qui permet de générer une table jointe avec
public class LigneCommandeProduit implements Serializable{

	//champs
	@Column(name="idProduit")
	private Long idProduit;
	
	@Column(name="idCommande")
	private Long idCommande;
	
	/**
	 * override pour l'embedable
	 */
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        LigneCommandeProduit that = (LigneCommandeProduit) o;
        return Objects.equals(idProduit, that.idProduit) &&
               Objects.equals(idCommande, that.idCommande);
    }
 
	/**
	 * override pour l'embedable
	 */
    @Override
    public int hashCode() {
        return Objects.hash(idProduit, idCommande);
    }

    //ctor
	public LigneCommandeProduit(Long idProduit, Long idCommande) {
		super();
		this.idProduit = idProduit;
		this.idCommande = idCommande;
	}

	public LigneCommandeProduit() {
		super();
	}

	//getter et setter
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
    
    
    
}
