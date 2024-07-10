package com.boa.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.app.entity.Admin;
import com.boa.app.entity.Course;
import com.boa.app.service.CRSAdminService;

@RestController
@RequestMapping("/admin")
public class CRSAdminController {

	@Autowired
	private CRSAdminService adminService;
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course course) {
		return adminService.addCourseService(course);
	}
	
	@PostMapping("/addAdmin")
	public String addAdmin(@RequestBody Admin admin) {
		return adminService.addAdminService(admin);
	}
	
	@GetMapping("/fetchAllAdmin")
	public List<Admin> getAdminDetails(){
		return adminService.getAllAdmin();
	}
	
	/*
	 * @PostMapping("/addProfessor") public String addProfessor(@RequestBody
	 * Professor professor) {
	 * 
	 * }
	 */
}
