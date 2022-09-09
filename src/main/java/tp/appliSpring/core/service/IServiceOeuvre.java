package tp.appliSpring.core.service;

import java.util.List;

import tp.appliSpring.core.entity.Emprunt;
import tp.appliSpring.core.entity.Oeuvre;

public interface IServiceOeuvre 
{
	Oeuvre saveOeuvre(Oeuvre oeuvre);
	Oeuvre updateOeuvre(Oeuvre oeuvre);
	Oeuvre getOeuvreById(Long idPublication);
	boolean deleteOeuvre(Oeuvre oeuvre);
	List<Emprunt> getListeAllOeuvre();

}
