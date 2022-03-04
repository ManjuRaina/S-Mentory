package com.example.mentory1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentory1.daolayer.MyDaoLayer;
import com.example.mentory1.modellayer.Student;

@Service
public class MyServiceImpl  implements Myservice{
	
	@Autowired
	private MyDaoLayer daoLayer;

	@Override
	public Student add(Student student) { 
		if(student!=null) {
			return daoLayer.save(student);
			}else{
				throw new RuntimeException("please enter the details");
			}
	}

	@Override
	public Student update(Student student, String stud_name) {
		if(stud_name !=null) {
			return daoLayer.save(student);
			
		}
		throw new RuntimeException(" Nothing has been updated");
	}

	@Override
	public void fetch(Student student, Integer stud_id) {
		Student byId = daoLayer.getById(stud_id);
		daoLayer.delete(byId);
	}

	@Override
	public List<Student> getAll() {
		
		return daoLayer.findAll();
	}

}
