package com.boa.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.app.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
