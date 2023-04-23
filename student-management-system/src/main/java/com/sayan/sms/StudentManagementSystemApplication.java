package com.sayan.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sayan.sms.entities.Student;
import com.sayan.sms.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Sayan", "Sengupta", "sayan@gmail.com");
		 * Student student2 = new Student("Harshit", "Aggarwal", "harshit@gmail.com");
		 * Student student3 = new Student("Raman", "Rao", "raman@gmail.com");
		 * 
		 * studentRepository.save(student1); studentRepository.save(student2);
		 * studentRepository.save(student3);
		 */
	}

}
