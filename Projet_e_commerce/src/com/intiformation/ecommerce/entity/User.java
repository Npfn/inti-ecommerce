package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long idUser;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	private boolean actived; 
	
	@OneToMany
	@JoinColumn(name="user_id")
	private Collection<Role> role;

	public User(Long idUser, String username, String password, boolean actived, Collection<Role> role) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.role = role;
	}

	public User(String username, String password, boolean actived, Collection<Role> role) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.role = role;
	}

	public User() {
		super();
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public Collection<Role> getRole() {
		return role;
	}

	public void setRole(Collection<Role> role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + ", actived=" + actived
				+ ", role=" + role + "]";
	}
	
	
	
	 
	
	
	
	
	
}
