package com.greatlearning.main;
import java.util.Scanner;


public class MinimumNotes {

private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// accept number of denominations (eg. 3) - size
	    // allocate a notes array of that size
		
		// accept the denominations (loop)
		
		// accept the amount
		
		// please raise you hand when you reach here
		
		System.out.println("Enter the number of denominations");
		int numDenomination=sc.nextInt();
		int[] notes= new int[numDenomination];
		System.out.println("Enter the  denominations");
		for( int i = 0; i < numDenomination; i++ ) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
	
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort( notes, 0, notes.length - 1 );
		int[] numNotes =new int[numDenomination];
		// Your logic to print the number of notes of each variety
		for (int i=0;i<notes.length;i++) {
			numNotes[i]=(int)(amount/notes[i]);
			amount=amount%notes[i];			
		}
		if (amount>0) {
			System.out.println("Not possible to pay");
		}
		else {
		for (int i=0;i<numDenomination;i++) {
			System.out.println( notes[i] + " : " + numNotes[i] );
			
		}
		
		}
	}
}


