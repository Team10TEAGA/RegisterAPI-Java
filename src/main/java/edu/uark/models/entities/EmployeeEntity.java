package edu.uark.models.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import edu.uark.dataaccess.entities.BaseEntity;
import edu.uark.dataaccess.repository.DatabaseTable;
import edu.uark.models.api.Employee;
import edu.uark.models.api.Product;
<<<<<<< HEAD
import edu.uark.models.entities.fieldnames.EmployeeFieldNames;
=======
>>>>>>> de29f3af9dec63ce0f5b25edbb9a47740fe7e7c0
import edu.uark.models.entities.fieldnames.ProductFieldNames;

public class EmployeeEntity extends BaseEntity<EmployeeEntity> 
{
	private String firstname;
	private String lastname;
	private String employeeID;
	private boolean active;
	private String role;
	private String manager;
	private String password;
	
	public EmployeeEntity() 
	{
		super(DatabaseTable.EMPLOYEE);
		
		this.firstname = StringUtils.EMPTY;
		this.lastname = StringUtils.EMPTY;
	   this.employeeID = StringUtils.EMPTY;
		this.active = false;
		this.role = StringUtils.EMPTY;
		this.manager = StringUtils.EMPTY;
		this.password = StringUtils.EMPTY;
	}
	
	public EmployeeEntity(Employee employee) 
	{
		super(DatabaseTable.EMPLOYEE);
		
		this.firstname = employee.getFirstName();
		this.lastname = employee.getLastName();
		this.employeeID = employee.getEmployeeID();
		this.active = employee.getActive();
		this.role = employee.getRole();
		this.manager = employee.getManager();
		this.password = employee.getPassword();
	}
	
   public Employee synchronize(Employee apiEmployee) {
      this.setFirstName(apiEmployee.getFirstName());
      this.setLastName(apiEmployee.getLastName());
      this.setEmployeeID(apiEmployee.getEmployeeID());
      this.setActive(apiEmployee.getActive());
      this.setRole(apiEmployee.getRole());
      this.setManager(apiEmployee.getManager());
      this.setPassword(apiEmployee.getPassword());
      
      apiEmployee.setId(this.getId());
      apiEmployee.setCreatedOn(this.getCreatedOn());
      
      return apiEmployee;
   }

	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException 
	{
		this.firstname = rs.getString(EmployeeFieldNames.FIRST_NAME);
		this.lastname = rs.getString(EmployeeFieldNames.LAST_NAME);
	   this.employeeID = rs.getString(EmployeeFieldNames.ID);
		this.active = rs.getBoolean(EmployeeFieldNames.ACTIVE);
		this.role = rs.getString(EmployeeFieldNames.ROLE);
		this.manager = rs.getString(EmployeeFieldNames.MANAGER);
		this.password = rs.getString(EmployeeFieldNames.PASSWORD);

		//this.lookupCode = rs.getString(some column);
		//this.firstname = rs.getString();
	}

	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) 
	{
		record.put(EmployeeFieldNames.FIRST_NAME, this.firstname);
		record.put(EmployeeFieldNames.LAST_NAME, this.lastname);
	   record.put(EmployeeFieldNames.ID, this.employeeID);
		record.put(EmployeeFieldNames.ACTIVE, this.active);
		record.put(EmployeeFieldNames.ROLE, this.role);
		record.put(EmployeeFieldNames.MANAGER, this.manager);
		record.put(EmployeeFieldNames.PASSWORD, this.password);
		return record;
	}
	
	public String getFirstName()
	{
		return this.firstname;
	}
	
	public EmployeeEntity setFirstName(String fn)
	{
		if(!StringUtils.equals(this.firstname, fn))
		{
			this.firstname = fn;
			this.propertyChanged(EmployeeFieldNames.FIRST_NAME);
		}
		return this;
	}
	
	public String getLastName()
	{
		return this.lastname;
	}
	
	public EmployeeEntity setLastName(String ln)
	{
		if(!StringUtils.equals(this.lastname, ln))
		{
			this.lastname = ln;
			this.propertyChanged(EmployeeFieldNames.LAST_NAME);
		}
		return this;
	}
	
   public String getEmployeeID()
   {
      return this.employeeID;
   }
   
   public EmployeeEntity setEmployeeID(String employeeID)
   {
      if(!StringUtils.equals(this.employeeID, employeeID))
      {
         this.employeeID = employeeID;
         this.propertyChanged(EmployeeFieldNames.ID);
      }
      return this;
   }
	
	public boolean getActive()
	{
		return this.active;
	}
	
	public EmployeeEntity setActive(boolean a)
	{
		if(a != this.active)
		{
			this.active = a;
			this.propertyChanged(EmployeeFieldNames.ACTIVE);
		}
		return this;
	}
	
	public String getRole()
	{
		return this.role;
	}
	
	public EmployeeEntity setRole(String role)
	{
		if(!StringUtils.equals(this.role, role))
		{
			this.role = role;
			this.propertyChanged(EmployeeFieldNames.ROLE);
		}
		return this;
	}
	
	public String getManager()
	{
		return this.manager;
	}
	
	public EmployeeEntity setManager(String m)
	{
		if(!StringUtils.equals(this.manager, m))
		{
			this.manager = m;
			this.propertyChanged(EmployeeFieldNames.MANAGER);
		}
		return this;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public EmployeeEntity setPassword(String pw)
	{
		if(!StringUtils.equals(this.password, pw))
		{
			this.password = pw;
			this.propertyChanged(EmployeeFieldNames.PASSWORD);
		}
		return this;
	}
}