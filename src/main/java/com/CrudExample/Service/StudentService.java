package com.CrudExample.Service;

import java.util.List;

import com.CrudExample.Entity.Student;

public interface StudentService {

	void saveStudent(Student student);

	Student getStudent(long id);

	void deleteBYId(Long id);

	List<Student> getAllStudent();







}
