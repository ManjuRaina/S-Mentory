package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface MyService {

	Employee add(Employee emp);

	void delete(int id);

	Employee update(Employee emp);

	List<Employee> getAll();


}
