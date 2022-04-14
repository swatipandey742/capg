package com.cpg.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Myarray {
	public static void main(String[]args) {
/*	ArrayList Is=new ArrayList();
	Is.add(10);
	Is.add("HELLO");
	System.out.println(Is);
	*/
		ArrayList<String> Is=new ArrayList<String>();
		ArrayList<Integer> Is1=new ArrayList<Integer>();
		Is1.add(30);
		Is1.add(45);
		Is1.add(60);
		Is1.add(75);
		Is.add("HEllo");
		Is.add("Java");
		Collections.sort(Is,Collections.reverseOrder());
		System.out.println(Is);
		System.out.println(Is1);
		System.out.println(Is1.equals(30));
		System.out.println(Is1.contains(45));
		Iterator<String> it=Is.iterator();
		while (it.hasNext()) {
			System.out.println(" it " +it.next());
			System.out.println();
		}
		
		


		
		
	}
}


	



		
		
