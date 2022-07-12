package com.app.project.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.project.main.model.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{

}
