package com.cpg.day6;

import java.util.ArrayList;

public class Myemployeemain {
	public static void main(String[]args) {
		ArrayList<Myemployee> ls=new ArrayList<Myemployee>();
		Myemployee E1=new Myemployee (1,"Anju",1000);
		Myemployee E2=new Myemployee (2,"Swati",2000);
		Myemployee E3=new Myemployee (3,"Ranu",3000);
		Myemployee E4=new Myemployee (4,"Him",5000);
		Myemployee E5=new Myemployee (5,"Pandey",8500);
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
		System.out.println(E4);
		System.out.println(E5);

		

}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
