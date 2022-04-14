package com.cpg.day4;

class Lamp{
	boolean ison;
	//method to turnon the light
	void turnon() {
		ison=true;
		System.out.println("Light on:"+ison);
	}
	//method to turnoff the light
	void turnoff() {
		ison=false;
		System.out.println("Light on:"+ison);

	}
}

public class Mainlamp {
	public static void main(String[]args) {
		
		//create object
	    Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		//turn on the light calling method
		led.turnon();
		//turn off the light calling method
		led.turnoff();



	}

}
