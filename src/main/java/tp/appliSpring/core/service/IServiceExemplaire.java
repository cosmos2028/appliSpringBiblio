package tp.appliSpring.core.service;

import java.util.List;

import tp.appliSpring.core.entity.Exemplaire;
import tp.appliSpring.core.entity.Oeuvre;

public interface IServiceExemplaire 
{
	Exemplaire saveExemplaire(Exemplaire exemplaire);
	Exemplaire updateExemplaire(Exemplaire exemplaire);
	Exemplaire getExemplaireById(Long idPublication);
	boolean deleteExemplaire(Oeuvre oeuvre);
	List<Exemplaire> getListeAllExemplaire();
	List<Exemplaire> findExemplairesForOeuvre(Oeuvre oeuvre);

}
