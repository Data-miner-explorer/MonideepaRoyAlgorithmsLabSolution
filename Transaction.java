package com.greatlearning.main;
import java.util.Scanner;

public class Transaction {
	private static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println( "Enter the number of transactions" );
		int size = sc.nextInt();		

		int[] transactions = new int[size];
				
		System.out.println( "Enter the transactions" );

		for( int i = 0; i < size; i++ ) {
			transactions[i] = sc.nextInt();
		}
		System.out.println( "Enter the number of targets" );
		int numTargets =sc.nextInt();
		
		for (int i=0;i<numTargets;i++) {
			System.out.println("Enter the target");
			int target=sc.nextInt();
			int sum=0;
			for( int j = 0; j < transactions.length; j++ ) {
				sum = sum + transactions[j];
				
				if( sum >= target ) {
					System.out.println( "Target achieved after " + ( j + 1 ) + " transactions" );
					break; // break out of the innermost for loop
				}
				
				// we come to the last transactions, yet target is not achieved
				if( j == transactions.length - 1 ) {
					System.out.println( "Target not achieved" );
				}
			}
		}
	}
}

		

	


