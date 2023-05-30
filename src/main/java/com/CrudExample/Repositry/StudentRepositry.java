package com.CrudExample.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CrudExample.Entity.Student;

public interface StudentRepositry extends JpaRepository<Student, Long> {

}
