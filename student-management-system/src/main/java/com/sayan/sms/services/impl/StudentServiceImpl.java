package com.sayan.sms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.sms.entities.Student;
import com.sayan.sms.repositories.StudentRepository;
import com.sayan.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public void saveNewStudent(Student student) {
		// save new student to student repository

		studentRepository.save(student);

	}

	@Override
	public Student getStudentById(Long id) {
		// get student by given id
		return studentRepository.findById(id).get();
	}

	@Override
	public void updateStudent(Student student) {
		// update the student information

		studentRepository.save(student);

	}

	@Override
	public void removeStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
