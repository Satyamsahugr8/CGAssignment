package com.java.universalRemote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 'TV' for selecting Television \n"
				       + "Enter 'AC' for selecting AirConditioner \n"
				       + "Enter 'WM' for selecting WashingMachine ");
		
		String choose = sc.next().toUpperCase();
		
		switch (choose) {
		
		case "TV":
			System.out.println("TV");
			break;
		case "AC":
			System.out.println("AC");
			break;
		case "WM":
			System.out.println("WM");
			break;
		default:
			break;
		}
		
		sc.close();
		
	}

}
