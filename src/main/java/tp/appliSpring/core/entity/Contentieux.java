package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contentieux")
public class Contentieux implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate  dateContentieux;
	private String motif;
	private Boolean regle;
	
	
	 @OneToOne(optional = false)
	 @JoinColumn(name = "fkey_empruntContentieux")
	 private Emprunt empruntContentieux;


	public Contentieux() 
	{
		super();
	}


	public Contentieux(LocalDate dateContentieux, String motif, Emprunt empruntContentieux) {
		super();
		this.dateContentieux = dateContentieux;
		this.motif = motif;
		this.empruntContentieux = empruntContentieux;
	}


	public LocalDate getDateContentieux() {
		return dateContentieux;
	}


	public void setDateContentieux(LocalDate dateContentieux) {
		this.dateContentieux = dateContentieux;
	}


	public String getMotif() {
		return motif;
	}


	public void setMotif(String motif) {
		this.motif = motif;
	}


	public Boolean getRegle() {
		return regle;
	}


	public void setRegle(Boolean regle) {
		this.regle = regle;
	}


	public Emprunt getEmpruntContentieux() {
		return empruntContentieux;
	}


	public void setEmpruntContentieux(Emprunt empruntContentieux) {
		this.empruntContentieux = empruntContentieux;
	}


	public Long getId() {
		return id;
	}
	
	 
	 

}
