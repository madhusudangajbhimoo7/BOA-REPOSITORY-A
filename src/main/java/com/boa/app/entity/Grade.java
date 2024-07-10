package com.boa.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gradeId;
	private int studentId;
	/**
	 * @return the gradeId
	 */
	public int getGradeId() {
		return gradeId;
	}
	/**
	 * @param gradeId the gradeId to set
	 */
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}
