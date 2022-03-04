package com.example.mentory1.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.mentory1.modellayer.DontShowMe;
import com.example.mentory1.modellayer.Student;
import com.example.mentory1.service.Myservice;

@RestController
@RequestMapping
public class MyController {
	
	@Autowired
	private Myservice myservice;
	
	@PostMapping("/add")
	public ResponseEntity<DontShowMe> adding(@RequestBody Student student){
		Student add=myservice.add(student );
		DontShowMe dontShowMe = new DontShowMe();
		dontShowMe.setData(dontShowMe);
		dontShowMe.setError(false);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

	@PutMapping("/update")
	public ResponseEntity<DontShowMe> updating(@RequestBody Student student){
		String stud_name = student.getStud_name();
		Student update=myservice.update(student,stud_name);
		DontShowMe dontShowMe = new DontShowMe();
		dontShowMe.setError(false);
		dontShowMe.setData(update);
	return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<?> fetch(@RequestParam Integer stud_id,Student student){
		myservice.fetch(student,stud_id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@GetMapping("getall")
	public List<Student> getAllById(){
	List<Student>all=myservice.getAll();
		return all;
	}
	

}  
