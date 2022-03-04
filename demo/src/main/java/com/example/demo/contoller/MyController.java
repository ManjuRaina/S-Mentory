package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DontShowMe;
import com.example.demo.model.Employee;
import com.example.demo.service.MyService;

@RestController
@RequestMapping
public class MyController {

	
	@Autowired
	private MyService service; 
	@PostMapping("/insert")
	public ResponseEntity<DontShowMe> addEmp( @RequestBody   Employee emp){
		Employee add=  service.add(emp);
		DontShowMe dontShowMe = new DontShowMe();
		dontShowMe.setData(dontShowMe);
		dontShowMe.setError(false);
		
		
		return new ResponseEntity("Data Added...",HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?>deleteEmp(@RequestParam   int id){
	service.delete(id);
		return new ResponseEntity<>("Data Deleted",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?>updateEmp(@RequestBody  Employee emp){
		service.update(emp);
		return new ResponseEntity<>("Data Updated..",HttpStatus.OK);
	}
	@GetMapping("getall")
	public List<Employee> getAllById(){
	List<Employee>all=	service.getAll();
		return all;
	}

}
