package tp.appliSpring.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RolePersonne implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long roleId;
	
	@Column(unique = true)
	private String roleName;
	
	private String description;
	
	
	public RolePersonne() {
		super();
	}


	public RolePersonne(String roleName) 
	{
		super();
		this.roleName = roleName;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getRoleId() {
		return roleId;
	}
	
	
	

}
