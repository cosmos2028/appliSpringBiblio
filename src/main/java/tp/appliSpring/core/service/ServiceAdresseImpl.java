package tp.appliSpring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.IAdresseRepository;
import tp.appliSpring.core.entity.Adresse;

@Service
@Transactional
public class ServiceAdresseImpl implements IServiceAdresse 
{
	@Autowired
	IAdresseRepository adresseRepository;

	@Override
	public Adresse saveAdresse(Adresse adressePers) 
	{
		return adresseRepository.save(adressePers);
	}

	@Override
	public Adresse updateAdresse(Adresse adressePers) 
	{
		return null;
	}

	@Override
	public boolean deleteAdresse(Adresse adressePers) 
	{
		return false;
	}

}
