package com.java.assignment1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	
//	    1
//	   1 1
//	  1 2 1
//	 1 3 3 1
//	1 4 6 4 1
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Rows :");
	int n = scanner.nextInt();
	
//	int n=5;
	
	//first line
	
	for (int i = 1; i < 2; i++) {
	for (int j = 1; j <= n+4; j++) {
		if (j == n) {
			System.out.print("1");
			}else {
				System.out.print(" ");
				}
		}
	}
	
	System.out.println("");
	
	//second to n 
	
	for (int h = 2; h <= n; h++) {
	for (int g = 1; g <= n+4; g++) {
		if (g == n-h+1 || g==n+h-1 ) {
			System.out.print("1");
			}
		else {
			System.out.print(" ");
			}
	}
	System.out.println("");
	}
	
	}
}
