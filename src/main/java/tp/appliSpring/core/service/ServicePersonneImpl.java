package tp.appliSpring.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.IPersonneRepository;
import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Employe;
import tp.appliSpring.core.entity.Personne;

@Service
@Transactional
public class ServicePersonneImpl implements IServicePersonne 
{
	
	private IPersonneRepository personneRepository;
	
	

	public ServicePersonneImpl(IPersonneRepository personneRepository) {
		super();
		this.personneRepository = personneRepository;
	}

	
	@Override
	public Abonne rechercherAbonne(String code_Pers) 
	{
		/*
		Optional<Personne> optionalPersonne = personneRepository.findByCodePers(code_Pers);
		if(optionalPersonne.isPresent()) {
			return (Abonne) optionalPersonne.get();
		}else {
			//throw new NotFoundException("aucun aboone existe avec le id="+id);
			throw new RuntimeException("aucun abonne existe avec l'id="+id);
			//avec @ResponseStatus(HttpStatus.NOT_FOUND) 
			//au dessus de class NotFoundException ..{}
		}*/
		return null;
	}

	@Override
	public Abonne rechercherAbonneByName(String nameAbonne) {
		return null;
	}
	
	@Override
	public Abonne sauvegarderAbonne(Personne abonne) 
	{
		return (Abonne) personneRepository.save(abonne);
	}

	@Override
	public boolean deleteAbonne(Personne abonne) {
		return false;
	}

	@Override
	public boolean verifierValiditeAbonnement() {
		return false;
	}

	
	

	@Override
	public Employe rechercherEmploye(String code_Emp) {
		return null;
	}


	@Override
	public Employe rechercherEmployeByName(String nameEmp) {
		return null;
	}


	@Override
	public Employe sauvegarderEmploye(Personne employe) {
		return (Employe) personneRepository.save(employe);
	}


	@Override
	public boolean deleteEmploye(Personne employe) {
		return false;
	}

	
	
}
