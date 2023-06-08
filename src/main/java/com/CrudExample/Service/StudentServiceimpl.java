package com.CrudExample.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.CrudExample.Entity.Student;
import com.CrudExample.Repositry.StudentRepositry;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	private StudentRepositry sturepo;

	@Override
	public void saveStudent(Student student) {
		sturepo.save(student);
		
	}
	
	@Override
	public Student getStudent(long id) {
		Optional<Student> findById = sturepo.findById(id);
		Student student = findById.get();
		return student;
	}

	@Override
	public void deleteBYId(Long id) {
		// TODO Auto-generated method stub
		sturepo.deleteById(id);
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return sturepo.findAll();
	}

	@Override
	public String updateStudent(Long id) {
		Optional<Student> findById = sturepo.findById(id);
		Student student = findById.get();
		return "student";
	}


	
	

	



}
