package com.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	public Employee getEmployee() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		System.out.println(emp);
		return emp;
	}
	
	/**
	 * you dont need to set produce as we set in above api
	 * @return
	 */
	@RequestMapping(value = "/employees", method = {RequestMethod.GET, RequestMethod.PUT})
	public Employee getEmployees() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		System.out.println(emp);
		return emp;
	}

}