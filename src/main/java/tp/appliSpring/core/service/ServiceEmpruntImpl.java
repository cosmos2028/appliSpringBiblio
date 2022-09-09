package tp.appliSpring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.IEmpruntRepository;
import tp.appliSpring.core.entity.Abonne;
import tp.appliSpring.core.entity.Emprunt;

@Service
@Transactional
public class ServiceEmpruntImpl implements IServiceEmprunt 
{

	@Autowired
	IEmpruntRepository empruntRepository;
	
	
	@Override
	public Emprunt saveEmprunt(Emprunt emprunt) 
	{
		return empruntRepository.save(emprunt);
	}

	@Override
	public Emprunt updateEmprunt(Emprunt emprunt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmprunt(Emprunt emprunt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Emprunt> getAllEmpruntByAbonne(Abonne abonne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emprunt> getListeEmpruntEnCours(Abonne abonne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emprunt> getListeAllEmprunt() {
		// TODO Auto-generated method stub
		return null;
	}

}
