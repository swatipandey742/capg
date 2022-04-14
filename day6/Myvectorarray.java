package com.cpg.day6;

import java.util.Vector;

public class Myvectorarray {
	public static void main(String[]args) {
		Vector<Integer> Is=new Vector<Integer>();
		Is.add(10);
		Is.add(15);
		Is.add(25);
		Is.add(35);
		Is.add(40);
		System.out.println(Is);
		Is.spliterator();
		System.out.println();
		System.out.println(Is.spliterator());

		

		
	}

}
