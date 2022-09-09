package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EM")
public class Employe extends Personne implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Employe() {super();	}

	public Employe(String code_pers, String nom, String prenom, String email, String password, LocalDate dateNaissance,
			Adresse adressePrincipale) {
		super(code_pers, nom, prenom, email, password, dateNaissance, adressePrincipale);
	}

}
