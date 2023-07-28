package com.java.assignment2;

import java.util.Scanner;

public class Main {
	
	
	/* 
	 * how to start this application
	 * first user needs to enter where he needs to use this
	 * remote for television or air condition or washing machine
	 * At each input user will get information about next step
	 * and i have added almost all the comments in this application 
	 */
	
	public static void main(String[] args) {
		
		RemoteTvImpl rti = new RemoteTvImpl();
		RemoteAcImpl rai = new RemoteAcImpl();
		RemoteWmImpl rwi = new RemoteWmImpl();
		
		Scanner sc = new Scanner(System.in);	

		int i = 0 ;
		
		// just a loop which never end but using break keyword we can go out of our loop.
		
		while(i==0) {

			System.out.print("Enter 'TV' for selecting Television \n" + 
			                 "Enter 'AC' for selecting AirConditioner \n" +
					         "Enter 'WM' for selecting WashingMachine \n"
					         + "Enter '0' to EXIT ");

			String choose = (sc.next()).toUpperCase();

			switch (choose) {
			case "TV":
				rti.remoteControl(); 
				break;
			
			case "WM":
				rwi.remoteControl();
				break;
			
			case "AC":
				rai.remoteControl();
				break;
			
			case "0":
				System.out.println("\nBye");
				i=1;
				break;
				
			default:
				break;

			} // switch ends

		} // for loop ends

	}

}
