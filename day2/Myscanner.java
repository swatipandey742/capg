package com.cpg.day2;

import java.util.Scanner;


public class Myscanner {
	public static void main(String[]args) {
        Scanner sc= new Scanner(System.in); //take the i/p from the user // 
        System.out.println("enter value other than int");
        
        int num1=sc.nextInt();
        System.out.println(num1);
        
        
        float f=sc.nextFloat();
        System.out.println("float number "+f);
        
        System.out.println("Enter the char");
        char c= sc.next().charAt(0);//this is use for print only one char//
        System.out.println(c);
        
        double d=sc.nextDouble();
        System.out.println("double number "+d);
        
        boolean b=sc.nextBoolean();
        System.out.println("boolean number "+b);

        
        

        





		
	}

}
