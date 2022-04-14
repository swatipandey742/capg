package com.cpg.day2;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[]args) {
		int year ;
		Scanner sc= new Scanner(System.in);		
		System.out.println("enter the leap year");	
		year =sc.nextInt();
		if(year%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
			
		}
	}
}