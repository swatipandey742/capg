package com.cpg.day4;

interface A{
	public static void print() {
		// TODO Auto-generated method stub
		
	}
}
class classname{
	public void println() {
	}
}

public class Myinterface {
	public static void main(String[]args) {	
		A a=new A() {

			public void print() {
				// TODO Auto-generated method stub
				System.out.println("java language");
				
			}
		};
		
		A.print();
	}
}
		
			
			
		



