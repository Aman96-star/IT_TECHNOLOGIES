package com.nit.Scenario_Based;

public class StudentGrade {

	private Student student;
	private char studentGrade;
	
	public StudentGrade(Student student,char studentGrade)
	{
	this.student =student;
	this.studentGrade = studentGrade;
	}

	Student getStudent() {
		return student;
	}

	void setStudent(Student student) {
		this.student = student;
	}

	char getStudentGrade() {
		return studentGrade;
	}

	void setStudentGrade(char studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() {
		return "StudentGrade [student=" + student + ", studentGrade=" + studentGrade + "]";
	}
	
	

}
