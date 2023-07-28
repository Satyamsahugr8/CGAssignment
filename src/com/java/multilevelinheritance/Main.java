package com.java.multilevelinheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// how to this application
		System.out.println("how to this application ");
		System.out.println(
				"first user needs to enter where he needs to use this remote for television or air condition or washing machine");
		System.out.println("At each input user will get information about next step");

		// and i have added almost all the comments in this application

		// i have written input code inside Userinput class
		Userinput user = new Userinput();
		user.input(); // calling input method to take user input
	}

}
