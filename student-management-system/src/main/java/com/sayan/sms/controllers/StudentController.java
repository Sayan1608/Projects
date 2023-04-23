package com.sayan.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sayan.sms.entities.Student;
import com.sayan.sms.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/allstudents")
	public String getAllStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "students";
	}

	@GetMapping("/addstudent")
	public String createStudentForm(Model model) {

		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	@PostMapping("/savestudent")
	public String saveNewStudent(@ModelAttribute("student") Student student) {

		// save new Student

		studentService.saveNewStudent(student);
		return "redirect:/allstudents";
	}

	@GetMapping("/edit/{id}")
	public String updateStudentForm(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "update_student";
	}

	@PostMapping("/edit/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());

		studentService.updateStudent(existingStudent);

		return "redirect:/allstudents";
	}

	@GetMapping("/delete/{id}")
	public String removeStudent(@PathVariable Long id) {
		studentService.removeStudentById(id);
		return "redirect:/allstudents";
	}

}
