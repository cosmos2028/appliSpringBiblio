package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="oeuvre")
public class Oeuvre implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPublication;
	
	private String titre;
	private String auteur;
	private String editeur;
	
	@OneToMany(mappedBy = "oeuvre", fetch = FetchType.LAZY)
	private List<Exemplaire> exemplaireList ;
	
	public Oeuvre() {super();}


	public Oeuvre(String titre, String auteur, String editeur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getEditeur() {
		return editeur;
	}


	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}


	public Long getIdPublication() {
		return idPublication;
	}
	
	
	
	
	
	
	


}
