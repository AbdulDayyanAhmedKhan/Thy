package com.adak.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adak.web.entity.Employee;
import com.adak.web.repository.Repository;

@Service
public class MyService {

	@Autowired
	Repository repository;

	public void addEmp(Employee emp) {
		repository.save(emp);
	}

	public List<Employee> getAllEmp() {
		return repository.findAll();
	}

}
