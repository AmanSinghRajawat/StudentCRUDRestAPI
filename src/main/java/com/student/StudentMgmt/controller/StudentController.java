package com.student.StudentMgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.StudentMgmt.entity.Students;
import com.student.StudentMgmt.repository.Repository;

@RestController
public class StudentController {

	@Autowired
	Repository studentRepo;
	
	
	@GetMapping("/test")
	public String testing() {
		return "Hey Postman...";
	}
	
	@PostMapping("/addStudent")
	public Students addStudent(@RequestBody Students s) {
		studentRepo.save(s);
		return s;
	}
	
	@GetMapping("/students")
	public List<Students> getStudents() {
		return studentRepo.findAll(); 
	}
	
	
	@GetMapping("/students/{rollno}")
	public Optional<Students> getStudentById(@PathVariable long rollno) {
		return studentRepo.findById(rollno);
	}
	
	
	@PutMapping("/updateStudent/{rollno}")
	public Optional<Students> updateStudent(@PathVariable long rollno, @RequestBody Students s) {
		Optional<Students> ss = studentRepo.findById(rollno);
		if(ss.isPresent()) {
			Students s1 = ss.get();
			if(s.getCity() != null){
				s1.setCity(s.getCity());
			}
			if(s.getName() != null){
				s1.setName(s.getName());
			}
			if(s.getPhoneNo() != 0){
				s1.setPhoneNo(s.getPhoneNo());
			}
			studentRepo.save(s1);
			return Optional.ofNullable(s1);
		}else {
			return null;
		}
	}
	
	@DeleteMapping("/deleteStudent/{rollno}")
	public String deletStudentById(@PathVariable long rollno) {
		studentRepo.deleteById(rollno);
		return "Student deleted by rollno "+rollno;
	}
	
}
