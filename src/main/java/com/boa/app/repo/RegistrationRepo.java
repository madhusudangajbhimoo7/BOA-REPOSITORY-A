package com.boa.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.app.entity.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer>{

}
