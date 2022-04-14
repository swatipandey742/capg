package com.cpg.day6;

class Emp<A,B,C>{
	A id;
	B name;
	C sal;
	public Emp(A id, B name, C sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	}
public class Genericemp {
	public static void main(String[]args) {
		Emp<Integer,String,Integer> e1= new Emp <Integer,String,Integer>(1001,"Swati",1500);
		Emp<Integer,String,Integer> e2= new Emp <Integer,String,Integer>(1002,"Swati",2500);
		Emp<Integer,String,Integer> e3= new Emp <Integer,String,Integer>(1003,"Swati",3500);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		
		
	}

}
