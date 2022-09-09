package tp.appliSpring.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp.appliSpring.core.entity.Oeuvre;

public interface IOeuvreRepository extends JpaRepository<Oeuvre,Long> 
{

}
