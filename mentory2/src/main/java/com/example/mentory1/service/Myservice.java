package com.example.mentory1.service;

import java.util.List;

import com.example.mentory1.modellayer.Student;

public interface Myservice {

	Student add(Student student);

	Student update(Student student, String stud_name);

	void fetch(Student student, Integer stud_id);

	List<Student> getAll();



}
