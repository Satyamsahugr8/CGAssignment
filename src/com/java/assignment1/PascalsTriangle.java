package com.java.assignment1;

import java.util.Scanner;

public class PascalsTriangle {
	
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
	
	
	// Algorithm for Pascal's Triangle 
	/*
	 * START Step 1: [Take Input] Read: Number of rows 
	 * Step 2 : [Define] printNum =1, blankSpace, i, j. 
	 * Step 3: Loop start from i = 0 to rows: 
	 * Loop start from blankSpace = 1 to rows-i [for space between number]: 
	 * print blankSpace " "
	 * Loop end 
	 * Loop start from j = 0 to i: 
	 * [Check If Condition] if i or j equals 0
	 * printNum = 1 
	 * [Check Else Condition] 
	 * printNum = printNum * (i - j + 1) / j;
	 * print printNum 
	 * Loop end 
	 * Give one line space 
	 * Loop end 
	 * Stop
	 */

	
	public static void main(String[] args) {
		
		int i, j, blankSpace, rows;
		int printNum = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows : ");
		rows = sc.nextInt();
		
//      rows = 5;
		
		// no. of rows
		for(i=0; i<rows; i++) {
			
			// no. of space in columns
			for(blankSpace=1; blankSpace <= rows-i-1; blankSpace++) {
				System.out.print(" ") ;
				}
			
			// no. to be printed after spaces
			for(j=0; j <= i; j++) {
				
				// condition to print 1 at first position after spaces
				if ( j==0 || i==0 ) {
					printNum = 1;
					}
				
				// condition to print middle number and last number
				else {
					printNum = printNum*(i-j+1)/j;
					}
				System.out.print(printNum + " ");
				}
			
			// changing line after each column
			System.out.print("\n");
			}
		}
}