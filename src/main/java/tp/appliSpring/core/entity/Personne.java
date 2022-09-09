package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="personne")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERS", 
discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Personne implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String code_pers;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private LocalDate dateNaissance;
	private boolean active;
	
	
	@ManyToOne
	@JoinColumn(name="codeAdrPrincipale")
	private Adresse adressePrincipale ;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "personne_role")
	private List<RolePersonne> appRoles = new ArrayList<RolePersonne>();
	
	
	public Personne() {
		super();
	}

	

	public Personne(String code_pers, String nom, String prenom, String email, String password, LocalDate dateNaissance,
			Adresse adressePrincipale)
	{
		super();
		this.code_pers = code_pers;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.adressePrincipale = adressePrincipale;
	}



	public String getCode_pers() {
		return code_pers;
	}


	public void setCode_pers(String code_pers) {
		this.code_pers = code_pers;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Adresse getAdressePrincipale() {
		return adressePrincipale;
	}


	public void setAdressePrincipale(Adresse adressePrincipale) {
		this.adressePrincipale = adressePrincipale;
	}


	public List<RolePersonne> getAppRoles() {
		return appRoles;
	}


	public void setAppRoles(List<RolePersonne> appRoles) {
		this.appRoles = appRoles;
	}
	
	
	
	
}
