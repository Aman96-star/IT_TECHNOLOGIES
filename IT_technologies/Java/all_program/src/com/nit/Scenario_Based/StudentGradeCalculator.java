package com.nit.Scenario_Based;

import java.util.*;

public class StudentGradeCalculator {

	 public static void main(String[]args)
	 {
		Scanner obj =new Scanner(System.in); 
		System.out.println("Etner the name : ");
		String name =obj.nextLine();
	 
		System.out.println("Etner the marks : ");
		int marks =obj.nextInt();
		
		Student s1 =new Student(name,marks);
		StudentGrade Student =CalculateStudentGrade.calculateGrade(s1);
		System.out.println(Student);
	 }
}
