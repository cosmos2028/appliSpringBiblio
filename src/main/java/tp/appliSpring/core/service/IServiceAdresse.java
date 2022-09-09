package tp.appliSpring.core.service;

import tp.appliSpring.core.entity.Adresse;

public interface IServiceAdresse 
{
	Adresse saveAdresse(Adresse adressePers);
	Adresse updateAdresse(Adresse adressePers);
	boolean deleteAdresse(Adresse adressePers);

}
