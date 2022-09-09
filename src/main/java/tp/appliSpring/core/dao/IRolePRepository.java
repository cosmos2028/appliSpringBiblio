package tp.appliSpring.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp.appliSpring.core.entity.RolePersonne;

public interface IRolePRepository extends JpaRepository<RolePersonne,Long> 
{

}
