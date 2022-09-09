package tp.appliSpring.reinit;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Adresse;
import tp.appliSpring.core.entity.Employe;
import tp.appliSpring.core.entity.Emprunt;
import tp.appliSpring.core.entity.EtatExemplaire;
import tp.appliSpring.core.entity.Exemplaire;
import tp.appliSpring.core.entity.Oeuvre;
import tp.appliSpring.core.entity.Personne;
import tp.appliSpring.core.entity.RolePersonne;
import tp.appliSpring.core.entity.UsageExemplaire;
import tp.appliSpring.core.service.IServiceAdresse;
import tp.appliSpring.core.service.IServiceEmprunt;
import tp.appliSpring.core.service.IServiceExemplaire;
import tp.appliSpring.core.service.IServiceOeuvre;
import tp.appliSpring.core.service.IServicePersonne;
import tp.appliSpring.core.service.IServiceRoleP;

@Component
@Profile("reInit")
public class ReInitDefaultDataSet {
	
	
	//@Autowired
	//private DeviseService deviseService;
	
	//private DeviseService deviseService;
	@Autowired
	private IServicePersonne servicePersonne;
	
	@Autowired
	private IServiceRoleP serviceRoleP;
	
	@Autowired
	private IServiceAdresse serviceAdresse;
	
	@Autowired
	private IServiceOeuvre serviceOeuvre;
	
	@Autowired
	private IServiceExemplaire serviceExemplaire;
	@Autowired
	private IServiceEmprunt serviceEmprunt;
	
	



	
	@PostConstruct
	public void initDataSet() 
	{
		//stocker les roles des personnes
		RolePersonne roleAbonne = new RolePersonne("abonne");
		RolePersonne roleEmploye = new RolePersonne("employe");
		RolePersonne roleAdmin = new RolePersonne("admin");
		
		serviceRoleP.saveRole(roleEmploye);
		serviceRoleP.saveRole(roleAbonne);
		serviceRoleP.saveRole(roleAdmin);
		
		//stocker les adresses
		Adresse adressePrincipale =  new Adresse(12L, "AV de paris", 94300L, "Vincennes", "FR") ;
		Adresse adressePrincipale2 =  new Adresse(12L, "BD de jouiv", 77325L, "nium", "FR") ;
		Adresse adressePrincipale3 =  new Adresse(12L, "AV de Pascal", 06521L, "nice", "FR") ;
		
		serviceAdresse.saveAdresse(adressePrincipale);
		serviceAdresse.saveAdresse(adressePrincipale2);
		serviceAdresse.saveAdresse(adressePrincipale3);
		 
		//stocker les abonnes
		Personne  abonne = new Abonne("P1", "Mbengane", "Charles", "charles@hotmail.fr", "1234",  LocalDate.of(2017, 1, 13),	adressePrincipale, LocalDate.now(),
				LocalDate.now().plusDays(5));
		
		abonne.getAppRoles().add(roleAbonne);
		servicePersonne.sauvegarderAbonne(abonne);
		
		//stocker les employes
		Personne employe = new Employe("P2", "yamamoto", "souzi", "yamamoto@gmail.com", "123",  LocalDate.of(2001, 8, 20), adressePrincipale3);
		
		employe.getAppRoles().add(roleEmploye);
		servicePersonne.sauvegarderEmploye(employe);
		
		//stocker les oeuvres
		Oeuvre oeuvre = new Oeuvre("potter", "ross", "marry curry");
		Oeuvre oeuvre2 = new Oeuvre("appologie de socrat", "platon", "zulu");
		Oeuvre oeuvre3 = new Oeuvre("les fleurs du mal", "Baudelaire", "pickette");
		Oeuvre oeuvre4 = new Oeuvre("le revolte", "camus", "vachette");
		
		serviceOeuvre.saveOeuvre(oeuvre);
		serviceOeuvre.saveOeuvre(oeuvre2);
		serviceOeuvre.saveOeuvre(oeuvre3);
		serviceOeuvre.saveOeuvre(oeuvre4);
		
		
		//stocker les exemplaires
		Exemplaire exemplaire = new Exemplaire(EtatExemplaire.BON_ETAT, UsageExemplaire.DISPONIBLE,oeuvre4);
		serviceExemplaire.saveExemplaire(exemplaire);
		
		//stocker les emprunt
		Emprunt emprunt = new Emprunt(LocalDate.now(), LocalDate.now().plusDays(10), (Abonne )abonne, exemplaire);
		serviceEmprunt.saveEmprunt(emprunt);
		
		
		
		
		
	}




}
