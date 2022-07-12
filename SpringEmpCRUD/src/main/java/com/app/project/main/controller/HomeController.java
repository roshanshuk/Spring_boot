package com.app.project.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.project.main.model.Employee;
import com.app.project.main.serviceImplementation.EmpServiceImpl;
@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	private EmpServiceImpl empServiceImpl;
	
	@PostMapping(value = "saveEmployee")
	public Employee saveEmp(@RequestBody Employee emp) {
		System.out.println("Employee save work properly");
		empServiceImpl.saveEmp(emp);
		return emp;
	}
	
	@GetMapping(value = "getAllStudents")
	public List<Employee> findAllEmployee(){
		return empServiceImpl.findAllEmployee();
	}
	
	@PutMapping(value = "updateEmployee")
	public Employee updateEmp(@RequestBody Employee emp) {
		return empServiceImpl.updateEmp(emp);
	}
	
	@DeleteMapping("deleteEmployee")
	public String deleteEmp(@RequestParam int eid) {
		empServiceImpl.deleteEmployee(eid);
		return "Employee Deleted !!!";
	}

}
