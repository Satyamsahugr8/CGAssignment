package com.java.assignment2;

import java.util.Scanner;

public class RemoteTvImpl implements IRemote { // implementing Remote to use its abstract method

	int volume;
	int channel;

	// default construtor to initial initial values
	public RemoteTvImpl() {
		this.volume = 3;
		this.channel = 1;
	}

	// power button
	@Override
	public void powerButton() {
		System.out.println("PowerOff TV");
	}

	// button1 with plus1 and minus1 is for volume
	@Override
	public int plusButton1(int volume) { // this method is to add volume by i and print it into console
		int ivolume = 10;
		if (volume < 10) {
			ivolume = volume + 1;
			System.out.println("volume " + ivolume);
		} else
			System.out.println("volume " + ivolume);
		return ivolume;
	}

	@Override
	public int minusButton1(int volume) { // this method is to minus volume by i and print it into console
		int ivolume = 0;
		if (volume > 0) {
			ivolume = volume - 1;
			System.out.println("volume " + ivolume);
		} else
			System.out.println("volume " + ivolume);
		return ivolume;
	}

	// button2 with plus2 and minus2 is for channel
	@Override
	public int plusButton2(int channel) { // this method is to add channel by i and print it into console
		int ichannel = 100;
		if (channel < 100) {
			ichannel = channel + 1;
			System.out.println("channel " + ichannel);
		} else
			System.out.println("channel" + ichannel);
		return ichannel;
	}

	@Override
	public int minusButton2(int channel) { // this method is to minus channel by i and print it into console
		int ichannel = 0;
		if (channel > 0) {
			ichannel = channel - 1;
			System.out.println("channel " + ichannel);
		} else
			System.out.println("channel " + ichannel);
		return ichannel;
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
		System.out.println("|   volume                channel |");
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

		System.out.println("TV"); // lets say for example we input tv then it will tv here

		System.out.println("Enter Power On/Off"); // and then it will ask for power on/off
		String power = (sc.next()).toUpperCase(); // input on/off

		if (power.equalsIgnoreCase("ON")) // if on -> then below remote will get printed with different remote option
											// for different inputs
		// like volume and channel for tv etc

		{
			// to print the button
			printRemote();
			// loop for many input after pressing plus1 button and then again
			int j = 0;
			while (j == 0) {

				System.out.println("Enter 'plus1' to increase volume \n" + "Enter 'minus1' to decrease volume \n"
						+ "Enter 'plus2' to change channel \n" + "Enter 'minus2' to change channel \n"
						+ "Enter 'Poweroff' to poweroff Application \n" + "Enter 'Switch' to switch the application");

				// lets take this as input
				String input = (sc.next()).toUpperCase();

				if (input.equals("PLUS1")) {
					volume = plusButton1(volume); // this method will be preformed and resultant return will be assigned
													// to volume
				} else if (input.equals("MINUS1")) {
					volume = minusButton1(volume);
				} else if (input.equals("PLUS2")) {
					channel = plusButton2(channel);
				} else if (input.equals("MINUS2")) {
					channel = minusButton2(channel);
				} else if (input.equals("POWEROFF")) {
//						powerOff();
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
