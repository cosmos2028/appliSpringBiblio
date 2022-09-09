package tp.appliSpring.core.service;

import tp.appliSpring.core.entity.RolePersonne;

public interface IServiceRoleP 
{
	RolePersonne saveRole(RolePersonne rolePers);
	RolePersonne updateRole(RolePersonne rolePers);
	boolean deleteRole(RolePersonne rolePers);

}
