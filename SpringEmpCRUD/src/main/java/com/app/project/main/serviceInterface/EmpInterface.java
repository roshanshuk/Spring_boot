package com.app.project.main.serviceInterface;

import java.util.List;

import com.app.project.main.model.Employee;

public interface EmpInterface {
	public Employee saveEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	public List<Employee> findAllEmployee();
	public void deleteEmployee(int id);
	
}
