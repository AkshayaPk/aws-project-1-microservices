package com.example.student;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin("*")
public class StudentController {

	@Autowired
    StudentRepository repository;
	
	@GetMapping(path = "/students/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudentById(@PathVariable(name = "id") Integer id) {
		return repository.findById(id);
	   }
	

	@GetMapping(path = "/students" )
	public List<Student> listAllStudents() {
		return repository.list();
	   }
}
