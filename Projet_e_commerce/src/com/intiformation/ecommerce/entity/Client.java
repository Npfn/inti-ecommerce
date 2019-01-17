package com.intiformation.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="client") //nom de l'entité si requete
@Table(name="client") //nom de la table
public class Client implements Serializable{

	//champs
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="idClient")
		private Long idClient;
		
		@Column(name="nomClient")
		private String nomClient;
		
		@Column(name="adresse")
		private String adresse;
		
		@Column(name="email")
		private String email;
		
		@Column(name="tel")
		private String tel;
		
		@OneToMany(cascade = CascadeType.ALL)
		private List<Commande> commandes;

		//ctor
		public Client(Long idClient, String nomClient, String adresse, String email, String tel,
				List<Commande> commandes) {
			super();
			this.idClient = idClient;
			this.nomClient = nomClient;
			this.adresse = adresse;
			this.email = email;
			this.tel = tel;
			this.commandes = commandes;
		}

		public Client(String nomClient, String adresse, String email, String tel, List<Commande> commandes) {
			super();
			this.nomClient = nomClient;
			this.adresse = adresse;
			this.email = email;
			this.tel = tel;
			this.commandes = commandes;
		}

		public Client() {
			super();
		}
		
		//getter et setter
		public Long getIdClient() {
			return idClient;
		}

		public void setIdClient(Long idClient) {
			this.idClient = idClient;
		}

		public String getNomClient() {
			return nomClient;
		}

		public void setNomClient(String nomClient) {
			this.nomClient = nomClient;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public List<Commande> getCommandes() {
			return commandes;
		}

		public void setCommandes(List<Commande> commandes) {
			this.commandes = commandes;
		}
		
		
		
		
		
}
