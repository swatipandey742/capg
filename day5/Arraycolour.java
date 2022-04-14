package com.cpg.day5;

import java.util.Arrays;

public class Arraycolour {
	public static void main(String[]args){
		String[] colorArray=new String[4];
		colorArray[0]="RED";
		colorArray[1]="black";
		colorArray[2]="white";
		System.out.println("Original Array :" +Arrays.toString(colorArray));
		String newItem ="yellow";
		System.out.println("after adding element :" +Arrays.toString(colorArray));
		
		
	}

}
