package com.cpg.day5;

public class Arraysort {
	public static void main(String[]args) {
		int temp ,size;
		int array[]= {10,20,52,87};
		size=array.length;
		for (int i=0 ; i<=size ;i=i+1) {
			for (int j=0 ; i<=size ;j=j+1) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}

		}
		
	System.out.println("largest no :" +array[size-1]);
		
		
	}
}
	