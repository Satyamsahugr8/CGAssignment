package com.java.multipleinheritance;

import java.util.Scanner;

public class Userinput extends MainImpl{
	
	// this is input method from which i am taking input as TV or AC or WM
	@SuppressWarnings("resource")
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		// Inside MainImpl what variable should be print in remote , as i have made a printable remote for good decision making
//		MainImpl mpl = new MainImpl();
		
		

		// just a loop which never end but using break keyword we can got our program.
//		for (int i = 0; i < 10000; i++) {
			
			
			System.out.print(
					"Enter 'TV' for selecting Television \n" + 
			        "Enter 'AC' for selecting AirConditioner \n"
				   +"Enter 'WM' for selecting WashingMachine ");

			String choose = (sc.next()).toUpperCase();

			
			switch (choose) {

			case "TV":
				imple(choose); // implementation of remote for TV i have written in MainImpl class so mpl is object of MainImpl
				break; // break basically through you out of the switch and again iw will ask for your input like TV , AC, or WM
			case "AC":
				imple(choose); // implementation of remote for AC i have written in MainImpl class
				break;
			case "WM":
				imple(choose); // implementation of remote for WM i have written in MainImpl class
				break;
			default:
				break;
			} // switch ends

		} // for loop ends
	}
//}
