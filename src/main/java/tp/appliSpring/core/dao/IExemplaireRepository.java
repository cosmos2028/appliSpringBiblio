package tp.appliSpring.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp.appliSpring.core.entity.Exemplaire;

public interface IExemplaireRepository  extends JpaRepository<Exemplaire,Long> 
{

}
