package com.cpg.day4;

class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
	public static void main (String[]args) {
		Student s=new Student(1001,"xyz");
		System.out.println(s.getId());
		System.out.println(s.getName());

	}

}
