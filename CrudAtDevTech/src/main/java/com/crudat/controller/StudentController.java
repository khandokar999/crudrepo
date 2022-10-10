package com.crudat.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudat.entity.Student;
import com.crudat.service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/Student")
	public Student addStudent( @RequestBody Student st)
	{
		return service.addStudent(st);
		
	}
	
	@GetMapping("/Student")
	public List<Student> getStudents()
	{
		return service.getStudents();
		
	}
	
	@GetMapping("/Student/{id}")
	public Optional<Student> getSTudentById(@PathVariable int id)
	{
		return service.getSTudentById(id);
		
	}
	
	@PutMapping("/Student")
	public Student updateSTudent(@RequestBody Student st)
	{
		return service.addStudent(st);
		
	}
	
	@DeleteMapping("/Student/{id}")
	public void delete(@PathVariable int id)
	{		
		service.delete(id);
	}
	
	
	
}
