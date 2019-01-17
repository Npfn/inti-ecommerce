package com.intiformation.ecommerce.dao;

import java.util.List;

import com.intiformation.ecommerce.bean.Categorie;
import com.intiformation.ecommerce.bean.Client;
import com.intiformation.ecommerce.bean.Commande;
import com.intiformation.ecommerce.bean.GestionPanier;
import com.intiformation.ecommerce.bean.Produit;
import com.intiformation.ecommerce.bean.Role;
import com.intiformation.ecommerce.bean.User;

public interface IBoutiqueDAO {

	public void ajouterCategorie(Categorie c);
	
	public List<Categorie> listCategories();
	
	public Categorie getCategorie(Long idCat);
	
	public void supprimerCategorie(Long idcat);
	
	public void modifierCategorie(Categorie c);
	
	public void ajouterProduit(Produit p, Long idCat);
	
	public List<Produit> listproduits();
	
	public List<Produit>  produitsParMotCle(String mc);
	
	public List<Produit> produitsParCategorie(Long idCat);
	
	public List<Produit> produitsSelectionnes();
	
	public Produit getProduit(Long idP);
	
	public void supprimerProduit(Long idP);
	
	public void modifierProduit(Produit p);
	
	public void ajouterUser(User u);
	
	public void attribuerRole(Role r, Long userID);
	
	public Commande enregistrerCommande(GestionPanier p, Client c);
	
	
}
