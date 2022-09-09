package tp.appliSpring.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp.appliSpring.core.dao.IRolePRepository;
import tp.appliSpring.core.entity.RolePersonne;

@Service
@Transactional
public class ServiceRolePImpl implements IServiceRoleP 
{
	
private IRolePRepository rolePRepository;
	
	

	public ServiceRolePImpl(IRolePRepository rolePRepository) {
		super();
		this.rolePRepository = rolePRepository;
	}



	@Override
	public RolePersonne saveRole(RolePersonne rolePers) {
		return rolePRepository.save(rolePers);
	}



	@Override
	public RolePersonne updateRole(RolePersonne rolePers) {
		return null;
	}



	@Override
	public boolean deleteRole(RolePersonne rolePers) {
		return false;
	}



}
