package com.intiformation.ecommerce.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.intiformation.ecommerce.bean.Categorie;
import com.intiformation.ecommerce.bean.Client;
import com.intiformation.ecommerce.bean.Commande;
import com.intiformation.ecommerce.bean.GestionPanier;
import com.intiformation.ecommerce.bean.LigneCommande;
import com.intiformation.ecommerce.bean.Produit;
import com.intiformation.ecommerce.bean.Role;
import com.intiformation.ecommerce.bean.User;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class BoutiqueDAOImpl  implements IBoutiqueDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterCategorie(Categorie c) {
		em.persist(c);
		
	}

	@Override
	public List<Categorie> listCategories() {
		Query query = em.createQuery("select c from Categorie c");
		return query.getResultList();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return em.find(Categorie.class, idCat);
	}

	@Override
	public void supprimerCategorie(Long idcat) {
		Categorie c = em.find(Categorie.class, idcat);
		em.remove(c);
			
	}

	@Override
	public void modifierCategorie(Categorie c) {
		em.merge(c);
		
	}

	@Override
	public void ajouterProduit(Produit p, Long idCat) {
		Categorie c = getCategorie(idCat);
		p.setCategorie(c);
		em.persist(p);
		
	}

	@Override
	public List<Produit> listproduits() {
		Query query = em.createQuery("select p from Produit p");
		return query.getResultList();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		Query query = em.createQuery("select p from Produit p where p.designation like :x or p.description like :x");
		query.setParameter("x","%"+mc+"%");
		return query.getResultList();
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		Query query = em.createQuery("select p from Produit p where p.categorie.idCategorie =:x ");
		query.setParameter("x",idCat);
		return query.getResultList();
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		Query query = em.createQuery("select p from Produit p where p.selectionne = true ");
		return query.getResultList();
	}

	@Override
	public Produit getProduit(Long idP) {
	
		return em.find(Produit.class, idP);
	}

	@Override
	public void supprimerProduit(Long idP) {
		Produit p = getProduit(idP);
		em.remove(p);
		
	}

	@Override
	public void modifierProduit(Produit p) {
		em.merge(p);
		
	}

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		User u = em.find(User.class, userID);
		u.getRole.add(r);
		em.persist(r);
		
	}

	@Override
	public Commande enregistrerCommande(GestionPanier p, Client cld) {
		em.persist(cld);
		Commande c  = new Commande();
		c.setDateCommande( new Date());
		c.setItems(p.getItems());
		for( LigneCommande lc:p.getItems()){
			em.persist(lc);
			
		}
		em.persist(c);
		return c;
	}
	
	
	
	
	
}
