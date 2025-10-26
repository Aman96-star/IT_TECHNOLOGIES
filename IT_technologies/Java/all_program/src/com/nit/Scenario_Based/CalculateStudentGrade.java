package com.nit.Scenario_Based;

public class CalculateStudentGrade {
	
	public static StudentGrade CalculateGrade(Student s) {
		
		int marks =s.getMarks();
		if(marks>=90) {
			return new StudentGrade(s,'A');
		}
		
		if(marks>=80) {
			return new StudentGrade(s,'B');
		}
		
		if(marks>=70) {
			return new StudentGrade(s,'A');
		}
		
		if(marks>=70) {
			return new StudentGrade(s,'C');
		}
		
		else {
			return new StudentGrade(s,'E');
		}
	}
	
	
}
