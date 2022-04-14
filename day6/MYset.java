package com.cpg.day6;

import java.util.HashSet;
import java.util.Iterator;

public class MYset {
	public static void main(String[]args) {
		HashSet<Integer> set=new HashSet<Integer>();
		//set stores the value in random manner
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		System.out.println(set);
		set.hashCode();
		System.out.println(set.hashCode());
		set.contains(56);
		System.out.println(set.contains(56));
		Iterator<Integer> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(" it " +it.next());
			System.out.println();
			
			
			
		}
	}


		

		
		
		
	

}
