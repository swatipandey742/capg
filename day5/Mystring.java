package com.cpg.day5;

public class Mystring {
	public static void main(String[]args) {
		String s1="Anjali pandey";
		String s2="Anu";
		String s3=" Hello ";
		String s4="Him";
		//compare value
		String s11 = "n";
		String s21= "u";
		System.out.println(s11.compareTo (s21));
		//combine two string
		System.out.println(s1.concat(s2));
		//search for string is contained in given string or not
		System.out.println(s3.contains("ll"));
		System.out.println(s3.contains("le"));
		//convert string to byte array
		byte[]b=s4.getBytes();
		System.out.println(s4.indexOf(5));
		System.out.println(s4.indexOf("H"));
		//add string to no
		System.out.println(s2 + 123);
		//replace
		System.out.println(s4.replace("H","A"));
		//subsquence
		System.out.println(s3.subSequence(0,2));
		//uppercase
		System.out.println(s3.toUpperCase());
		//lowercase
		System.out.println(s1.toLowerCase());
		//remove space
		System.out.println(s3.trim());
		
		
	}
	}
