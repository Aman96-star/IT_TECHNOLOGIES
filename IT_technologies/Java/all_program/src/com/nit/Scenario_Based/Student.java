package com.nit.Scenario_Based;

public class Student {

	private String name;
	private int marks;
	
	public Student(String name,int marks)
	{
	this.name =name;
	this.marks = marks;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
