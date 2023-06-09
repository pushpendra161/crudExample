package com.CrudExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CrudExample.Dto.StudentDto;
import com.CrudExample.Entity.Student;
import com.CrudExample.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stuservice;
	
	
	@PostMapping("/saveStudent")
	public void saveStudent(@RequestBody Student student) {
		
		stuservice.saveStudent(student);
	}
	
	@GetMapping("/getstudent")
	public List<Student> getAllStudent() {
		
		return  stuservice.getAllStudent() ;
	}
	
	
	@GetMapping("/getstudent/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return stuservice.getStudent(id);
	}
	
	@DeleteMapping("/deletestu/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		stuservice.deleteBYId(id);
	}
		
	@PutMapping("/updatestudent/{id}")
	public String updateById(@PathVariable  Long id,@RequestBody Student student) {
		StudentDto studentdto = new StudentDto();
		
		studentdto.setId(student.getId());
		studentdto.setName(student.getName());
		studentdto.setCity(student.getCity());
		studentdto.setMobile(student.getMobile());
		
//		student.setId(studentdto.getId());
//		student.setName(studentdto.getName());
//		student.setCity(studentdto.getCity());
//		student.setMobile(studentdto.getMobile());
//		 
		String saveStudent = stuservice.updateStudent(id);
		stuservice.saveStudent(student);
		return "saveStudent" ;
		
		}
			
		 	
			
		}	
