package edu.uark.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.uark.commands.products.EmployeeCreateCommand;
import edu.uark.commands.products.EmployeesExistQuery;
import edu.uark.models.api.Employee;

public class EmployeeRestController extends ProductRestController {

   //creating employee record
   @RequestMapping(value = "/Create", method = RequestMethod.PUT)
   public Employee putEmployee(@RequestBody Employee employee) {
      return (new EmployeeCreateCommand()).
         setApiEmployee(employee).
         execute();
   }
   
   //determine number of existing employee records
   @RequestMapping(value = "/Exist", method = RequestMethod.GET)
   public Employee getEmployees() {
      return (new EmployeesExistQuery()).execute();
   } 
}
