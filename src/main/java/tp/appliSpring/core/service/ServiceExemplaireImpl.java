package tp.appliSpring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.IExemplaireRepository;
import tp.appliSpring.core.entity.Exemplaire;
import tp.appliSpring.core.entity.Oeuvre;
@Service
@Transactional
public class ServiceExemplaireImpl implements IServiceExemplaire {

	@Autowired
	private IExemplaireRepository exemplaireRepository;
	
	
	@Override
	public Exemplaire saveExemplaire(Exemplaire exemplaire) 
	{
		return exemplaireRepository.save(exemplaire);
	}

	@Override
	public Exemplaire updateExemplaire(Exemplaire exemplaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exemplaire getExemplaireById(Long idPublication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteExemplaire(Oeuvre oeuvre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Exemplaire> getListeAllExemplaire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exemplaire> findExemplairesForOeuvre(Oeuvre oeuvre) {
		// TODO Auto-generated method stub
		return null;
	}

}
