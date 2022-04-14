package com.cpg.day3;

public class emp {
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	int id;
	String name;
	double sal;
	//constructor 
	public emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
public static void main(String[]args) {
	System.out.println(getID());
	
}
private static char[] getID() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
	


