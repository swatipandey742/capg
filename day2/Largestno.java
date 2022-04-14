package com.cpg.day2;

import java.util.Scanner;

public class Largestno {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("largest one no");
		int num1 = sc .nextInt();
		
		System.out.println("largest second no");
		int num2 = sc .nextInt();
		
		System.out.println("largest third no");
		int num3 = sc .nextInt();
		
		if (num1>num2)
			System.out.println("first no");
		else if (num2>num3) {
			System.out.println("second no");
		}
		else if (num3>num1) {
			System.out.println("third no");
			
		}
	}
}


		
		


		
		
		
		
		
	



