package com.intiformation.ecommerce.service;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

public interface IAdminCategoriesService extends IAdminProduitService {

	
	
	public void addCategorie(Categorie c);
	
	public void deleteCategrorie(Long idCat);
	
	public void updateCategorie(Categorie c);
	
	public void addUser(User u);
	
	public void getRole(Role r, Long userID);
	
	
	
	
}//fin interface
