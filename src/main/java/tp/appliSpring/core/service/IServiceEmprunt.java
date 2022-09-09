package tp.appliSpring.core.service;

import java.util.List;

import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Emprunt;

public interface IServiceEmprunt 
{
	//calculerNbExemplairesAutorises(Long numAbonne)
	
	Emprunt saveEmprunt(Emprunt emprunt);
	Emprunt updateEmprunt(Emprunt emprunt);
	boolean deleteEmprunt(Emprunt emprunt);
	List<Emprunt> getAllEmpruntByAbonne (Abonne abonne);
	List<Emprunt> getListeEmpruntEnCours(Abonne abonne);
	List<Emprunt> getListeAllEmprunt();

}
