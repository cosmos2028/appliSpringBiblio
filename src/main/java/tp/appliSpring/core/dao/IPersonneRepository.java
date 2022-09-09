package tp.appliSpring.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp.appliSpring.core.entity.Personne;

public interface IPersonneRepository  extends JpaRepository<Personne,String> {

}
