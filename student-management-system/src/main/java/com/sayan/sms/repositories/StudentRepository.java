package com.sayan.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayan.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
