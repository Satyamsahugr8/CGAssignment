package com.java.multipleinheritance;

import java.util.Scanner;

public class MainImpl {

	// here is imple method
	public void imple(String choose) {

		if (choose.equals("TV")) {
			String chooseTv = choose; // here i am initialing TV to chooseTv and then
			String button1 = "volume";
			String button2 = "channel";
			controls(chooseTv, button1, button2); // then i am giving these argument to controls method of MainControl
													// class
			// or you can say calling controls method with given arguments
		}

		// same thing with others too
		else if (choose.equals("AC")) {
			String chooseAc = choose;
			String button1 = "temperature";
			String button2 = "Fan speed";
			controls(chooseAc, button1, button2);
		}

		else if (choose.equals("WM")) {
			String chooseWm = choose;
			String button1 = "swing speed";
			String button2 = "swing speed";
			controls(chooseWm, button1, button2);
		}

	}

	// now here is controls method of MainImpl class
	// where All main methods are working here

	// lets take {choose = TV}
	// controls(TV, "volume", "channel")
	public void controls(String choose, String but1, String but2) {

		Scanner sc = new Scanner(System.in);

		// class instance for implementation of different operation in line 110 onwards
		RemoteImpl inhere = new RemoteImpl();

//			int volume = 3;

		// tv initials
		int volume = 3;
		int channel = 1;

		// ac initials
		int temp = 25;
		int acSpeed = 3;

		// wm initials
		int wmSpeed = 3;

//			int a = 1;
//			int b = 1;

		System.out.println(choose); // lets say for example we input tv then it will tv here
		System.out.println("Enter Power On/Off"); // and then it will ask for power on/off
		String power = (sc.next()).toUpperCase(); // input on/off

		if (power.equalsIgnoreCase("ON")) // if on -> then below remote will get printed with different remote option for different inputs
			//like volume and channel for tv etc

		{
			System.out.println("Power On");
			System.out.println("---------------Remote--------------");
			System.out.println("+---------------------------------+");
			System.out.println("|                                 |");
			System.out.println("|    #####      #####      #####  |");
			System.out.println("|    # + #      # P #      # + #  |");
			System.out.println("|    #####      #####      #####  |");
			System.out.println("|    plus1      Power      plus2  |");
			System.out.println("|   " + but1 + "            " + but2 + "    |");
			System.out.println("|                                 |");
			System.out.println("|    #####      #####      #####  |");
			System.out.println("|    # - #      # S #      # - #  |");
			System.out.println("|    #####      #####      #####  |");
			System.out.println("|    minus1     Switch    minus2  |");
			System.out.println("|                                 |");
			System.out.println("|                                 |");
			System.out.println("+---------------------------------+");

			// loop for many input after pressing plus1 button and then again
			for (int j = 0; j < 10000; j++) { 

				System.out.println("Enter 'plus1' to increase " + but1 + "\n" + "Enter 'minus1' to decrease " + but1
						+ " \n" + "Enter 'plus2' to change " + but2 + " \n" + "Enter 'minus2' to change " + but2 + " \n"
						+ "Enter 'Poweroff' to poweroff Application \n" + "Enter 'Switch' to switch the application");

				
				// inside this if condition if choose is TV then what plus1 plus2 minus1 minus2 
				//button will preform is written below and calling for different methods is decribed below
				
				if (choose.equals("TV")) { 
					
					// lets take this as input written above in line 94
					String input = (sc.next()).toUpperCase();
					
					if (input.equals("PLUS1"))  // after input  if input is Plus1 then 
						{ 
						volume = inhere.tvplusButton1(volume); // this method will be preformed and resultant return will be assigned to volume 						
					} 
					
					//similarly for all other input different methods are preformed
					
					else if (input.equals("MINUS1")) {
						volume = inhere.tvminusButton1(volume);
					} else if (input.equals("PLUS2")) {
						channel = inhere.tvplusButton2(channel);
					} else if (input.equals("MINUS2")) {
						channel = inhere.tvminusButton2(channel);
					} 
					
					// here user can input poweroff to power off there application
					
					else if (input.equals("POWEROFF")) {
						inhere.powerButton();
						break;
					} 
					// here user can input switch to switch there application to ac to wm to tv
					else if (input.equals("SWITCH")) {
						String chooseAc = "AC";
						imple(chooseAc);
						break;
					}
				}

				// similarly all these operation are followed according to there inputs
				
				else if (choose.equals("AC")) {
					String input = (sc.next()).toUpperCase();
					if (input.equals("PLUS1")) {
						temp = inhere.acplusButton1(temp);
					} else if (input.equals("MINUS1")) {
						temp = inhere.acminusButton1(temp);
					} else if (input.equals("PLUS2")) {
						acSpeed = inhere.acplusButton2(acSpeed);
					} else if (input.equals("MINUS2")) {
						acSpeed = inhere.acminusButton2(acSpeed);
					} else if (input.equals("POWEROFF")) {
						inhere.powerButton();
						break;
					} else if (input.equals("SWITCH")) {
						String chooseWm = "WM";
						imple(chooseWm);
						break;
					}
				}

				else if (choose.equals("WM")) {
					String input = (sc.next()).toUpperCase();
					if (input.equals("PLUS1")) {
						wmSpeed = inhere.wmplusButton1(wmSpeed);
					} else if (input.equals("MINUS1")) {
						wmSpeed = inhere.wmminusButton1(wmSpeed);
					} else if (input.equals("PLUS2")) {
						wmSpeed = inhere.wmplusButton2(wmSpeed);
					} else if (input.equals("MINUS2")) {
						wmSpeed = inhere.wmminusButton2(wmSpeed);
					} else if (input.equals("POWEROFF")) {
						inhere.powerButton();
						break;
					} else if (input.equals("SWITCH")) {
						String chooseTv = "TV";
						imple(chooseTv);
						break;
					}
				}

			} // end of for loop

		}
		// this else if is for power input if power input is off then  this will get printed
		else if (power.equalsIgnoreCase("OFF")) {
			System.out.println("Power Off");
		}
		else
			System.out.println("Choose your application again");

	}

}
