package com.crudat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudat.entity.Student;
import com.crudat.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository repository;
	
	public Student addStudent(Student st)
	{
		return repository.save(st);
		
	}
	
	public List<Student> getStudents()
	{
		return repository.findAll();
		
	}
	
	public Optional<Student> getSTudentById(int id)
	{
		return repository.findById(id);
		
	}
	
	public void delete(int id)
	{
		repository.deleteById(id);
		
	}
}
