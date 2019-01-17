package com.intiformation.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Role") //nom de l'entité si requete
@Table(name="Role") //nom de la table
public class Role implements Serializable{
	
	//champs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idRole")
	private Long idRole;
	
	@Column(name="roleName")
	private String roleName;
	
//	@OneToOne
//	@JoinColumn(name="userId", referencedColumnName="user_id")
//	private User user;
	
	
	public Role() {
		super();
	}


	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}


	public Long getIdRole() {
		return idRole;
	}


	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


//	public User getUser() {
//		return user;
//	}
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}


	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName+ "]";
	}



}