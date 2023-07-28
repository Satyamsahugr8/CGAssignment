package com.java.assignment2;

import java.util.Scanner;

public class RemoteAcImpl implements IRemote { // implementing Remote to use its abstract method

	int temp;
	int fanSpeed;

	// default construtor to initial initial values
	public RemoteAcImpl() {
		this.temp = 25;
		this.fanSpeed = 3;
	}

	@Override
	public void powerButton() {
		System.out.println("PowerOff AC");

	}

	// button1 with plus1 and minus1 is for temperature
	@Override
	public int plusButton1(int temp) { // this method is to add temperature by i and print it into console
		int itemp = 40;
		if (temp < 40) {
			itemp = temp + 1;
			System.out.println("temperature " + itemp);
		} else
			System.out.println("temperature " + itemp);
		return itemp;
	}

	@Override
	public int minusButton1(int temp) { // this method is to minus temperature by i and print it into console
		int itemp = 25;
		if (temp > 25) {
			itemp = temp - 1;
			System.out.println("temperature " + itemp);
		} else
			System.out.println("temperature " + itemp);
		return itemp;
	}

	// button2 with plus2 and minus2 is for fan speed
	@Override
	public int plusButton2(int acSpeed) { // this method is to add fan speed by i and print it into console
		int iacSpeed = 10;
		if (acSpeed < 10) {
			iacSpeed = acSpeed + 1;
			System.out.println("fan speed " + iacSpeed);
		} else
			System.out.println("fan speed " + iacSpeed);
		return iacSpeed;
	}

	@Override
	public int minusButton2(int acSpeed) { // this method is to minus fan speed by i and print it into console
		int iacSpeed = 0;
		if (acSpeed > 0) {
			iacSpeed = acSpeed - 1;
			System.out.println("fan speed " + iacSpeed);
		} else
			System.out.println("fan speed " + iacSpeed);
		return iacSpeed;
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
		System.out.println("| Temperature            Fanspeed |");
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

		System.out.println("AC"); // lets say for example we input tv then it will tv here
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

				System.out.println("Enter 'plus1' to increase Temperature \n"
						+ "Enter 'minus1' to decrease Temperature \n" + "Enter 'plus2' to change Fanspeed \n"
						+ "Enter 'minus2' to change Fanspeed \n" + "Enter 'Poweroff' to poweroff Application \n"
						+ "Enter 'Switch' to switch the application");

				// lets take this as input 
				String input = (sc.next()).toUpperCase();

				if (input.equals("PLUS1")) {
					temp = plusButton1(temp);
				} else if (input.equals("MINUS1")) {
					temp = minusButton1(temp);
				} else if (input.equals("PLUS2")) {
					fanSpeed = plusButton2(fanSpeed);
				} else if (input.equals("MINUS2")) {
					fanSpeed = minusButton2(fanSpeed);
				} else if (input.equals("POWEROFF")) {
					powerButton();
					break;
				} else if (input.equals("SWITCH")) {
					switchButton();
					break;
				} else
					System.out.println("enter correct button");
			}
		} 
		
		
		// this else if is for power input if power input is off then this will get
			// printed
		else if (power.equalsIgnoreCase("OFF")) {
			System.out.println("Power Off");
		} else
			System.out.println("Choose your application again");

	}
}
