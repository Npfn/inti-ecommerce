package com.intiformation.ecommerce.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.GestionPanier;
import com.intiformation.ecommerce.entity.LigneCommande;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BoutiqueDAOImpl  implements IBoutiqueDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public void ajouterCategorie(Categorie c) {
		em.persist(c);
		
	}

	@Transactional
	@Override
	public List<Categorie> listCategories() {
		Query query = em.createQuery("select c from Categorie c");
		return query.getResultList();
	}

	@Transactional
	@Override
	public Categorie getCategorie(Long idCat) {
		return em.find(Categorie.class, idCat);
	}

	@Transactional
	@Override
	public void supprimerCategorie(Long idcat) {
		Categorie c = em.find(Categorie.class, idcat);
		em.remove(c);
			
	}

	@Transactional
	@Override
	public void modifierCategorie(Categorie c) {
		em.merge(c);
		
	}

	@Transactional
	@Override
	public void ajouterProduit(Produit p, Long idCat) {
		Categorie c = getCategorie(idCat);
		p.setCategorie(c);
		em.persist(p);
		
	}

	@Transactional
	@Override
	public List<Produit> listproduits() {
		Query query = em.createQuery("select p from Produit p");
		return query.getResultList();
	}

	@Transactional
	@Override
	public List<Produit> produitsParMotCle(String mc) {
		Query query = em.createQuery("select p from Produit p where p.designation like :x or p.description like :x");
		query.setParameter("x","%"+mc+"%");
		return query.getResultList();
	}

	@Transactional
	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		Query query = em.createQuery("select p from Produit p where p.categorie.idCategorie =:x ");
		query.setParameter("x",idCat);
		return query.getResultList();
	}

	@Transactional
	@Override
	public List<Produit> produitsSelectionnes() {
		Query query = em.createQuery("select p from Produit p where p.selectionne = true ");
		return query.getResultList();
	}

	@Transactional
	@Override
	public Produit getProduit(Long idP) {
	
		return em.find(Produit.class, idP);
	}

	@Transactional
	@Override
	public void supprimerProduit(Long idP) {
		Produit p = getProduit(idP);
		em.remove(p);
		
	}

	@Transactional
	@Override
	public void modifierProduit(Produit p) {
		em.merge(p);
		
	}

	@Transactional
	@Override
	public void ajouterUser(User u) {
		em.persist(u);
		
	}

	@Transactional
	@Override
	public void attribuerRole(Role r, Long userID) {
		User u = em.find(User.class, userID);
		u.getRole().add(r);
		em.persist(r);
		
	}

	@Transactional
	@Override
	public Commande enregistrerCommande(GestionPanier p, Client cld) {
		em.persist(cld);
		Commande c  = new Commande();
		c.setDateCommande( new Date());
		c.setLigneCommandes(p.getLigneCommandes());
		for( LigneCommande lc:p.getLigneCommandes()){
			em.persist(lc);
			
		}
		em.persist(c);
		return c;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	
	
}
