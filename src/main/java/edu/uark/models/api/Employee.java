package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.uark.models.entities.EmployeeEntity;

public class Employee {
	private UUID id;
	public UUID getId() {
		return this.id;
	}
	public Employee setId(UUID id) {
		this.id = id;
		return this;
	}
	
	private String firstName;
	public String getFirstName() {
		return this.firstName;
	}
	public Employee setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	private String lastName;
	public String getLastName() {
      return this.lastName;
	}
   public Employee setLastName(String lastName) {
	   this.lastName = lastName;
	   return this;
	}

   private String employeeID;
   public String getEmployeeID() {
      return this.employeeID;
   }
   public Employee setEmployeeID(String employeeID) {
      this.employeeID = employeeID;
      return this;
   }
   
   private boolean active;
   public boolean getActive() {
      return this.active;
   }
   public Employee setActive(boolean active) {
      this.active = active;
      return this;
   }
   
   private String role;
   public String getRole() {
      return this.role;
   }
   public Employee setRole(String role){
      this.role = role;
      return this;
   }
   
   private String manager;
   public String getManager() {
      return this.manager;
   }
   public Employee setManager(String manager) {
      this.manager = manager;
      return this;
   }
   
   private String password;
   public String getPassword() {
      return this.password;
   }
   public Employee setPassword(String password) {
      this.password = password;
      return this;
   }
   
	private LocalDateTime createdOn;
	public LocalDateTime getCreatedOn() {
		return this.createdOn;
	}
	public Employee setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
		return this;
	}
	
	public Employee() {
		this.id = new UUID(0, 0);
		this.firstName = "";
		this.lastName = "";
		this.employeeID = "";
		this.active = false;
		this.role = "";
		this.manager = "";
		this.password = "";
		this.createdOn = LocalDateTime.now();
	}
	
	public Employee(EmployeeEntity employeeEntity) {
      this.id = employeeEntity.getId();
      this.firstName = employeeEntity.getFirstName();
      this.lastName = employeeEntity.getLastName();
      this.employeeID = employeeEntity.getEmployeeID();
      this.active = employeeEntity.getActive();
      this.role = employeeEntity.getRole();
      this.manager = employeeEntity.getManager();
      this.password = employeeEntity.getPassword();
      this.createdOn = employeeEntity.getCreatedOn();
	}
}
