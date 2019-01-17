package com.intiformation.ecommerce.service;

import java.util.List;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.GestionPanier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

public interface IBoutiqueService {

	
	//M�thodes Cat�gorie
	public void addCategorie(Categorie c);
	
	public List<Categorie> getListCategories();
	
	public Categorie findCategorie(Long idCat);
	
	public void deleteCategrorie(Long idCat);
	
	public void updateCategorie(Categorie c);
	
	
	//M�thodes Produit
	public void addProduit(Produit p, Long idCat);
	
	public List<Produit> getListproduits();
	
	public List<Produit> produitsByKeyWord(String mc);
	
	public List<Produit> produitsByCategorie(Long idCat);
	
	public List<Produit> produitsSelected();
	
	public Produit findProduit(Long idP);
	
	public void deleteProduit(Long idP);
	
	public void updateProduit(Produit p);
	
	
	//M�thodes ROLE_
	public void addUser(User u);
	
	public void getRole(Role r, Long userID);
	
	public Commande saveCommand(GestionPanier gp, Client c);

	
	
	
}//fin interface
