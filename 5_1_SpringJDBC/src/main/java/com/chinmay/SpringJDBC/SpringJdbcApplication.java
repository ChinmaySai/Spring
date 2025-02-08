package com.chinmay.SpringJDBC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chinmay.SpringJDBC.model.Student;
import com.chinmay.SpringJDBC.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
		
		Student s=context.getBean(Student.class);
	       s.setRolNum(10);
	       s.setName("Chinmay");
	       s.setMarks(85);
	       StudentService ss=context.getBean(StudentService.class);
	       ss.addStudent(s);
	       List<Student> stdata=ss.getStudents();
	       System.out.println("Student data "+stdata);
	}

}
