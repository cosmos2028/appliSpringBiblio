package tp.appliSpring.core.service;

import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Employe;
import tp.appliSpring.core.entity.Personne;

public interface IServicePersonne 
{
	Abonne rechercherAbonne(String code_Pers);
	Abonne rechercherAbonneByName(String nameAbonne);
	Abonne sauvegarderAbonne(Personne abonne);
	boolean deleteAbonne(Personne abonne);
	boolean verifierValiditeAbonnement(); 
	
	Employe rechercherEmploye(String code_Emp);
	Employe rechercherEmployeByName(String nameEmp);
	Employe sauvegarderEmploye(Personne employe);
	boolean deleteEmploye(Personne employe);
	

}
