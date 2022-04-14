package com.cpg.day4;

class Bank{
	float getRateOfIntrest() {return 0;}
}
class SBI extends Bank{
	float getRateOfIntrest() {return 4.2f;}
}
class ICICI extends Bank{
	float getRateOfIntrest() {return 2.2f;}
}
class AXIS extends Bank{
	float getRateOfIntrest() {return 5.2f;}

}
public class Testpolymorphism {
	public static void main(String[]args) {
		Bank b=new SBI();
		System.out.println(" SBI rate of intrest: " + b.getRateOfIntrest());
		Bank b1=new ICICI();
		System.out.println(" ICICI rate of intrest :" + b1.getRateOfIntrest());
		Bank b11=new ICICI();
		System.out.println(" Axis rate of intrest :" + b11.getRateOfIntrest());


	}

}
