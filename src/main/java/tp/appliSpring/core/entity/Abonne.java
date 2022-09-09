package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("AB")
public class Abonne extends Personne implements Serializable
{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LocalDate dateDebutAbonnement;
	private LocalDate dateFinAbonnement;
	
	@OneToMany(mappedBy = "abonne", fetch = FetchType.LAZY)
	private List<Emprunt> empruntList ;
	
	
	
	public Abonne(){super();}



	public Abonne(String code_pers, String nom, String prenom, String email, String password, LocalDate dateNaissance,
			Adresse adressePrincipale, LocalDate dateDebutAbonnement,
			LocalDate dateFinAbonnement) 
	{
		super(code_pers, nom, prenom, email, password, dateNaissance, adressePrincipale);
		this.dateDebutAbonnement = dateDebutAbonnement;
		this.dateFinAbonnement = dateFinAbonnement;
	}



	public LocalDate getDateDebutAbonnement() {
		return dateDebutAbonnement;
	}



	public void setDateDebutAbonnement(LocalDate dateDebutAbonnement) {
		this.dateDebutAbonnement = dateDebutAbonnement;
	}



	public LocalDate getDateFinAbonnement() {
		return dateFinAbonnement;
	}



	public void setDateFinAbonnement(LocalDate dateFinAbonnement) {
		this.dateFinAbonnement = dateFinAbonnement;
	}



	public List<Emprunt> getEmpruntList() {
		return empruntList;
	}



	public void setEmpruntList(List<Emprunt> empruntList) {
		this.empruntList = empruntList;
	}
	
	


	
}
