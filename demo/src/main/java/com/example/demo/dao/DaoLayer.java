package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface DaoLayer extends JpaRepository<Employee, Integer> {
	
	public Employee getById(int id);
	
}
