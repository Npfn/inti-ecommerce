package com.intiformation.ecommerce.service;

import com.intiformation.ecommerce.entity.Produit;

public interface IAdminProduitService extends IInternauteBoutique {

	
	public void addProduit(Produit p, Long idCat);
	
	public void deleteProduit(Long idP);
	
	public void updateProduit(Produit p);
	
	
	
}//fin interface
