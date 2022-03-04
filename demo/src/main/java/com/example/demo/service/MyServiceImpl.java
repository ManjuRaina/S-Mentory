package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoLayer;
import com.example.demo.model.Employee;

@Service
public class MyServiceImpl  implements MyService{

	@Autowired
	private DaoLayer dao;
	
	
	@Override
	public Employee add(Employee emp) {
		if(emp!=null) {
		return dao.save(emp);
		}else{
			throw new RuntimeException("the emp object is null");
		}
		
	}


	@Override
	public void delete(int id) {
	 Employee byId = dao.getById(id);
		dao.delete(byId);
	}


	@Override
	public Employee update(Employee emp) {
		
		return dao.save(emp);
	}


	@Override
	public List<Employee> getAll() {
		
		return dao.findAll();
		
	}


	

	
	
}
