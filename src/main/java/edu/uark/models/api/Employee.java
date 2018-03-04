package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.uark.models.entities.EmployeeEntity;

public class Employee 
{
	public UUID id;
	private String firstname;
	private String lastname;
	private boolean active;
	private String role;
	private String manager;
	private String password;
	public LocalDateTime createdOn;
	
	public Employee()
	{
		this.id = new UUID(0,0);
		this.createdOn = LocalDateTime.now();
		this.firstname = "";
		this.lastname = "";
		this.active = false;
		this.role = "";
		this.manager = "";
		this.password = "";
	}
	
	public Employee(EmployeeEntity employeeEntity)
	{
		this.id = employeeEntity.getId();
		this.createdOn = employeeEntity.getCreatedOn();
		/*this.firstname = employeeEntity.getFirstName();
		this.lastname = employeeEntity.getLastName();
		this.active = employeeeEntity.getActive();
		this.role = employeeEntity.getRole();
		this.manager = employeeEntity.getManager();
		this.password = employeeEntity.getPassword();*/
	}
	
	public UUID getId()
	{
		return this.id;
	}
	
	public Employee setId (UUID id)
	{
		this.id = id;
		return this;
	}
	
	public LocalDateTime getCreatedOn()
	{
		return this.createdOn;
	}
	
	public String getFirstName()
	{
		return this.firstname;
	}
	
	public void setFirstName(String fn)
	{
		this.firstname = fn;
	}
	
	public String getLastName()
	{
		return this.lastname;
	}
	
	public void setLastName(String ln)
	{
		this.lastname = ln;
	}
	
	public boolean getActive()
	{
		return this.active;
	}
	
	public void setActive(boolean a)
	{
		this.active = a;
	}
	
	public String getRole()
	{
		return this.role;
	}
	
	public void setRole(String r)
	{
		this.role = r;
	}
	
	public String getManager()
	{
		return this.manager;
	}
	
	public void setManager(String m)
	{
		this.manager = m;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String pw)
	{
		this.password = pw;
	}
}
