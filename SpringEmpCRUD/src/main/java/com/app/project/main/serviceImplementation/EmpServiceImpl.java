package com.app.project.main.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.main.dao.EmpRepository;
import com.app.project.main.model.Employee;
import com.app.project.main.serviceInterface.EmpInterface;
@Service
public class EmpServiceImpl implements EmpInterface{
	
	@Autowired
	private EmpRepository empRepo;

	@Override
	public Employee saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) empRepo.findAll();
	}

	@Override
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		empRepo.deleteById(eid);
	}
	
}
