package com.chinmay.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinmay.SpringJDBC.model.Student;
import com.chinmay.SpringJDBC.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo sr;
	public void addStudent(Student s) {

		sr.save(s);
	}
	public List<Student> getStudents() {
		return sr.findAll();
	}

}
