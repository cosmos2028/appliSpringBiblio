package tp.appliSpring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.IOeuvreRepository;
import tp.appliSpring.core.entity.Emprunt;
import tp.appliSpring.core.entity.Oeuvre;

@Service
@Transactional
public class ServiceOeuvreImpl implements IServiceOeuvre
{

	@Autowired
	IOeuvreRepository oeuvreRepository;
	
	
	@Override
	public Oeuvre saveOeuvre(Oeuvre oeuvre) 
	{
		return oeuvreRepository.save(oeuvre);
	}

	@Override
	public Oeuvre updateOeuvre(Oeuvre oeuvre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oeuvre getOeuvreById(Long idPublication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOeuvre(Oeuvre oeuvre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Emprunt> getListeAllOeuvre() {
		// TODO Auto-generated method stub
		return null;
	}

}
