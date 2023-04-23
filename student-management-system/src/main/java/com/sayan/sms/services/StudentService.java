package com.sayan.sms.services;

import java.util.List;

import com.sayan.sms.entities.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	void saveNewStudent(Student student);
	
	Student getStudentById(Long id);
	
	void updateStudent(Student student);
	
	void removeStudentById(Long id);
	
	
}
