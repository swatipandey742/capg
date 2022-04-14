package com.cpg.day6;

import java.util.LinkedHashSet;

public class Mylinkedhashlist {
	public static void main(String[]args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("python");
		set.add("is");
		set.add("easy");
		set.add("language");
		System.out.println(set);
		set.add("very");
		System.out.println(set.add("very"));
		set.size();
		System.out.println(set.size());
		set.contains("zxz");
		System.out.println(set.contains("zxz"));
		Object arr[]=set.toArray();
		System.out.println(arr.length);
		for (Object obj:arr) {
			System.out.println("s" +(Integer)obj);
			
		}
		
		


		

		
		
	}

}
