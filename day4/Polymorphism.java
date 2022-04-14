package com.cpg.day4;

class person{
	public void work() {
		System.out.println("sleep");
	}
	public void work(int homeWork) {
		System.out.println("doing home work");
	}
	public void work(String schoolwork) {
		System.out.println("doing school work");
	}

		
	
	}

public class Polymorphism {
	public static void main(String[]args) {
		person anu=new person();
		anu.work();
		anu.work(2);
		anu.work("english");
		
	}

}
