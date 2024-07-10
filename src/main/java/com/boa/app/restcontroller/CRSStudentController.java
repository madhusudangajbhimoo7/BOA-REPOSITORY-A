package com.boa.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.app.entity.Course;
import com.boa.app.entity.Student;
import com.boa.app.service.CRSStudentService;

@RestController
@RequestMapping("/student")
public class CRSStudentController {

	@Autowired
	private CRSStudentService studentService;
	
	@GetMapping("/viewCatalog")
	public ResponseEntity<List<Course>> viewCatalog(){
		return new ResponseEntity<List<Course>>(studentService.fetchCatalog(), HttpStatus.OK);
	}
	
	@PostMapping("/registerStudent")
	public ResponseEntity<String> register(@RequestBody Student student){
		return new ResponseEntity<String> (studentService.registerStudent(student), HttpStatus.OK);
	}
}
