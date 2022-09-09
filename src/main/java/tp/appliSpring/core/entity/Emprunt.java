package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="emprunt")
public class Emprunt implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateDebutEmprunt;
	private LocalDate dateFinEmprunt;

	@ManyToOne
	@JoinColumn(name="code_abonne")
	private Abonne abonne;
	
	
	@OneToOne(mappedBy = "empruntContentieux")
    private Contentieux contentieux;
	
	@ManyToOne
	@JoinColumn(name="code_exemplaire")
	private Exemplaire code_exemplaire;

	public Emprunt() {super();}

	public Emprunt(LocalDate dateDebutEmprunt, LocalDate dateFinEmprunt, Abonne abonne, Exemplaire code_exemplaire) {
		super();
		this.dateDebutEmprunt = dateDebutEmprunt;
		this.dateFinEmprunt = dateFinEmprunt;
		this.abonne = abonne;
		this.code_exemplaire = code_exemplaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateDebutEmprunt() {
		return dateDebutEmprunt;
	}

	public void setDateDebutEmprunt(LocalDate dateDebutEmprunt) {
		this.dateDebutEmprunt = dateDebutEmprunt;
	}

	public LocalDate getDateFinEmprunt() {
		return dateFinEmprunt;
	}

	public void setDateFinEmprunt(LocalDate dateFinEmprunt) {
		this.dateFinEmprunt = dateFinEmprunt;
	}

	public Abonne getAbonne() {
		return abonne;
	}

	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}

	public Contentieux getContentieux() {
		return contentieux;
	}

	public void setContentieux(Contentieux contentieux) {
		this.contentieux = contentieux;
	}

	public Exemplaire getCode_exemplaire() {
		return code_exemplaire;
	}

	public void setCode_exemplaire(Exemplaire code_exemplaire) {
		this.code_exemplaire = code_exemplaire;
	}

	
	
	
	
}
