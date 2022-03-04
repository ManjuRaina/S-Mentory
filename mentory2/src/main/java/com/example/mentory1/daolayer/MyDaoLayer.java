package com.example.mentory1.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mentory1.modellayer.Student;

@Repository
public interface MyDaoLayer extends JpaRepository<Student, Integer> {

public Student findById(int stud_id);
}
