package com.java.assignment2;

import java.util.Scanner;

public class RemoteWmImpl implements IRemote { // implementing Remote to use its abstract method

	int spinSpeed;

	// default construtor to initial initial values
	public RemoteWmImpl() {
		this.spinSpeed = 3;
	}

	@Override
	public void powerButton() {
		System.out.println("PowerOff WM");
	
	}

	// button1 with plus1 and minus1 is for spin speed
	@Override
	public int plusButton1(int wmSpeed) { // this method is to add spin speed by i and print it into console
		int iwmSpeed = 10;
		if (wmSpeed < 10) {
			iwmSpeed = wmSpeed + 1;
			System.out.println("spin speed " + iwmSpeed);
		} else
			System.out.println("spin speed " + iwmSpeed);
		return iwmSpeed;
	}

	@Override
	public int minusButton1(int wmSpeed) { // this method is to minus spin speed by i and print it into console
		int iwmSpeed = 0;
		if (wmSpeed > 0) {
			iwmSpeed = wmSpeed - 1;
			System.out.println("spin speed " + iwmSpeed);
		} else
			System.out.println("spin speed " + iwmSpeed);
		return iwmSpeed;
	}

	// button2 with plus2 and minus2 is for speed
	@Override
	public int plusButton2(int wmSpeed) { // this method is to add spin speed by i and print it into console
		int iwmSpeed = 10;
		if (wmSpeed < 10) {
			iwmSpeed = wmSpeed + 1;
			System.out.println("spin speed " + iwmSpeed);
		} else
			System.out.println("spin speed " + iwmSpeed);
		return iwmSpeed;
	}

	@Override
	public int minusButton2(int wmSpeed) { // this method is to minus spin speed by i and print it into console
		int iwmSpeed = 0;
		if (wmSpeed > 0) {
			iwmSpeed = wmSpeed - 1;
			System.out.println("spin speed " + iwmSpeed);
		} else
			System.out.println("spin speed " + iwmSpeed);
		return iwmSpeed;
	}

	@Override
	public void switchButton() {
		System.out.println("Choose application you need to switch");
		
	}
	
	public void printRemote() {
		System.out.println("Power On");
		System.out.println("---------------Remote--------------");
		System.out.println("+---------------------------------+");
		System.out.println("|                                 |");
		System.out.println("|    #####      #####      #####  |");
		System.out.println("|    # + #      # P #      # + #  |");
		System.out.println("|    #####      #####      #####  |");
		System.out.println("|    plus1      Power      plus2  |");
		System.out.println("|                                 |");
		System.out.println("|   SpinSpeed           SpinSpeed |");
		System.out.println("|                                 |");
		System.out.println("|    #####      #####      #####  |");
		System.out.println("|    # - #      # S #      # - #  |");
		System.out.println("|    #####      #####      #####  |");
		System.out.println("|    minus1     Switch    minus2  |");
		System.out.println("|                                 |");
		System.out.println("|                                 |");
		System.out.println("+---------------------------------+");
	}

	
	
	
	
	
	
	
	
	
	public void remoteControl() {

		Scanner sc = new Scanner(System.in);

		System.out.println("WM"); // lets say for example we input tv then it will tv here
		System.out.println("Enter Power On/Off"); // and then it will ask for power on/off
		String power = (sc.next()).toUpperCase(); // input on/off

		if (power.equalsIgnoreCase("ON")) // if on -> then below remote will get printed with different remote option
											// for different inputs
		// like volume and channel for tv etc

		{
			printRemote();
			
			// loop for many input after pressing plus1 button and then again
			int j = 0;
			while (j == 0) {

				System.out.println("Enter 'plus1' to increase SpinSpeed \n"
						+ "Enter 'minus1' to decrease SpinSpeed \n" + "Enter 'plus2' to change SpinSpeed \n"
						+ "Enter 'minus2' to change SpinSpeed \n" + "Enter 'Poweroff' to poweroff Application \n"
						+ "Enter 'Switch' to switch the application");

				// lets take this as input 
				String input = (sc.next()).toUpperCase();

				if (input.equals("PLUS1")) {
					spinSpeed = plusButton1(spinSpeed);
				} else if (input.equals("MINUS1")) {
					spinSpeed = minusButton1(spinSpeed);
				} else if (input.equals("PLUS2")) {
					spinSpeed = plusButton2(spinSpeed);
				} else if (input.equals("MINUS2")) {
					spinSpeed = minusButton2(spinSpeed);
				} else if (input.equals("POWEROFF")) {
					powerButton();
					break;
				} else if (input.equals("SWITCH")) {
					switchButton();
					break;
				} else
					System.out.println("enter correct button");
				
			}
			// for loop ends here
		}
		// this else if is for power input if power input is off then this will get printed
		else if (power.equalsIgnoreCase("OFF")) {
			System.out.println("Power Off");
		} else
			System.out.println("Choose your application again");

	}

}
