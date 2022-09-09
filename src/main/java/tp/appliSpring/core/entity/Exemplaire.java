package tp.appliSpring.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="exemplaire")
public class Exemplaire implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroExemplaire;
	
	@Enumerated (EnumType.STRING)
	private EtatExemplaire etatPhysique;
	
	@Enumerated (EnumType.STRING)
	private UsageExemplaire usageExemplaire;
	
	@OneToMany(mappedBy = "code_exemplaire", fetch = FetchType.LAZY)
	private List<Emprunt> empruntList ;
	
	@ManyToOne
	@JoinColumn(name="code_oeuvre")
	private Oeuvre oeuvre;

	public Exemplaire() {super();}

	public Exemplaire(EtatExemplaire etatPhysique, UsageExemplaire usageExemplaire, Oeuvre oeuvre) {
		super();
		this.etatPhysique = etatPhysique;
		this.usageExemplaire = usageExemplaire;
		this.oeuvre = oeuvre;
	}

	public EtatExemplaire getEtatPhysique() {
		return etatPhysique;
	}

	public void setEtatPhysique(EtatExemplaire etatPhysique) {
		this.etatPhysique = etatPhysique;
	}

	public UsageExemplaire getUsageExemplaire() {
		return usageExemplaire;
	}

	public void setUsageExemplaire(UsageExemplaire usageExemplaire) {
		this.usageExemplaire = usageExemplaire;
	}

	public List<Emprunt> getEmpruntList() {
		return empruntList;
	}

	public void setEmpruntList(List<Emprunt> empruntList) {
		this.empruntList = empruntList;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	public Long getNumeroExemplaire() {
		return numeroExemplaire;
	}
	
	

	
}
