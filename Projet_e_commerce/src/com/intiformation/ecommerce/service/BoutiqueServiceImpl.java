package com.intiformation.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.ecommerce.dao.IBoutiqueDAO;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.GestionPanier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

@Service("boutiqueService")
public class BoutiqueServiceImpl implements IAdminCategoriesService {

	@Autowired
	private IBoutiqueDAO boutiqueDAO ;
	
	
	/**
	 * setter pour injection spring	
	 * @param boutiqueDAO
	 */
	public void setBoutiqueDAO(IBoutiqueDAO boutiqueDAO) {
		this.boutiqueDAO = boutiqueDAO;
	}
	

	
	//Méthodes Categorie
	@Override
	@Transactional
	public void addCategorie(Categorie c) {

		boutiqueDAO.ajouterCategorie(c) ;		
	}

	
	@Override
	@Transactional
	public List<Categorie> getListCategories() {

		return boutiqueDAO.listCategories() ;
	}

	
	@Override
	@Transactional
	public Categorie findCategorie(Long idCat) {

		return boutiqueDAO.getCategorie(idCat) ; 
	}
		
	
	@Override
	@Transactional
	public void deleteCategrorie(Long idCat) {
		
		boutiqueDAO.supprimerCategorie(idCat) ;
	}

	@Override
	@Transactional
	public void updateCategorie(Categorie c) {

		boutiqueDAO.modifierCategorie(c) ;
	}

	
	//Méthode produit
	@Override
	@Transactional
	public void addProduit(Produit p, Long idCat) {

		boutiqueDAO.ajouterProduit(p, idCat) ;
	}

	@Override
	@Transactional
	public List<Produit> getListproduits() {

		return boutiqueDAO.listproduits() ;
	}

	@Override
	@Transactional
	public List<Produit> produitsByKeyWord(String mc) {

		return boutiqueDAO.produitsParMotCle(mc) ;
	}

	@Override
	@Transactional
	public List<Produit> produitsByCategorie(Long idCat) {

		return boutiqueDAO.produitsParCategorie(idCat) ;
	}

	@Override
	@Transactional
	public List<Produit> produitsSelected() {

		return boutiqueDAO.produitsSelectionnes() ;
	}

	@Override
	@Transactional
	public Produit findProduit(Long idP) {

		return boutiqueDAO.getProduit(idP) ;
	}

	@Override
	@Transactional
	public void deleteProduit(Long idP) {

		boutiqueDAO.supprimerProduit(idP) ;
	}

	@Override
	@Transactional
	public void updateProduit(Produit p) {

		boutiqueDAO.modifierProduit(p) ;
	}

	
	//Méthodes ROLE_
	@Override
	@Transactional
	public void addUser(User u) {

		boutiqueDAO.ajouterUser(u) ;
	}

	@Override
	@Transactional
	public void getRole(Role r, Long userID) {

		boutiqueDAO.attribuerRole(r, userID) ;
	}

	@Override
	@Transactional
	public Commande saveCommand(GestionPanier gp, Client c) {

		return boutiqueDAO.enregistrerCommande(gp, c) ;
	}

	
}//fin classe
