package com.cpg.day3;

import java.io.IOError;
import java.util.Scanner;

class NotEligiableVote extends Exception
{
	NotEligiableVote(String msg)
	{
		super(msg);
	}
	public class MyvoteException{
		public static void main(String[]args) throws NotEligiableVote {
			try (Scanner sc = new Scanner(System.in)) 
			{
				int num=sc.nextInt();
				if (num>18)
				{
					System.out.println(num);
					
				}
				else
				{
					throw new NotEligiableVote("under 18");
				}
			}
			
		}
	}
}
		
	



