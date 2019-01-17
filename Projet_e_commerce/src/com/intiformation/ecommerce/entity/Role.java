package com.intiformation.ecommerce.entity;

import java.io.Serializable;

public class Role implements Serializable{
	
	private Long idRole;
	private String roleName;
	
	
	private User user;
	
	
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


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + ", user=" + user + "]";
	}



}