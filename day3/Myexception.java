package com.cpg.day3;

public class Myexception {
	public static void main(String[]args) {
	/*	try {
		
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch ( ArithmeticException arithmaticexception) {
			System.out.println("result as " +0);
		}
		finally {
			System.out.println("final block");
		}
		}
	}*/
		try
		{
			String a=null;
			System.out.println(a.charAt(2));
		}
		finally 
		{
			System.out.println("final");
		}
}
}
		
		

			
		
			

		
		
			
	


