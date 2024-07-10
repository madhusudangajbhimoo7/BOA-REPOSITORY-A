package com.boa.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.app.entity.Grade;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Integer>{

}
