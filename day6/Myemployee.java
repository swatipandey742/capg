package com.cpg.day6;

public class Myemployee {
	
	private int id;
	private String name;
	private double sal;
	public Myemployee(int id, String name, double sal) {
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
	@Override
	public String toString() {
		return "Myemployee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public int compareTo(Myemployeemain E1) {
		// TODO Auto-generated method stub
		
		if (this.getId()>E1.getId()) {
			return 1;}
		else if(this.getId()<E1.getId()) {
			return -1;}
		else {
			return 0;
			
		}
	}


}


		
	
	

	
		
	
	
	


	
	