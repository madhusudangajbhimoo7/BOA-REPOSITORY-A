package com.boa.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.app.entity.Admin;
import com.boa.app.entity.Course;
import com.boa.app.entity.Professor;
import com.boa.app.repo.AdminRepo;
import com.boa.app.repo.CourseRepo;

import io.micrometer.common.util.StringUtils;

@Service
public class CRSAdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	
	public String addAdminService(Admin admin) {
		if (admin != null) {
			adminRepo.save(admin);
			return "admin added succesfully .... !";
		}
		else 
			return "no data present .... !";
	}
	

	public String addCourseService(Course course) {

		if (course != null && StringUtils.isNotBlank(course.getCourseName())) {
			Course byCourseName = courseRepo.findByCourseName(course.getCourseName());
			if (byCourseName != null)
				return "course already present .... !";
			else {
				courseRepo.save(course);
				return "course added successfully .... !";
			}

		} else
			return "no data received ...... !";
	}
	
	public List<Admin> getAllAdmin(){
		return adminRepo.findAll();
	}

}
