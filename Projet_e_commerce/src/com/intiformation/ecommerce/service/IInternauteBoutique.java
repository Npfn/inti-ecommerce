package com.intiformation.ecommerce.service;

import java.util.List;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.GestionPanier;
import com.intiformation.ecommerce.entity.Produit;

public interface IInternauteBoutique {


	public List<Categorie> getListCategories();
	
	public Categorie findCategorie(Long idCat);
	
	public List<Produit> getListproduits();
	
	public List<Produit> produitsByKeyWord(String mc);
	
	public List<Produit> produitsByCategorie(Long idCat);
	
	public List<Produit> produitsSelected();
	
	public Produit findProduit(Long idP);
	
	public Commande saveCommand(GestionPanier gp, Client c);
	
		
	
}//fin interface
