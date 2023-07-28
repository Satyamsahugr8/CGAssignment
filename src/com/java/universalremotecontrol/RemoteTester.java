package com.java.universalremotecontrol;import java.util.Scanner;

public class RemoteTester {

	public RemoteTester() {
		
	}

	public static void main(String[] args) 
	{
		Scanner scAppliance = new Scanner(System.in);
		Scanner scRemote = new Scanner(System.in);
		//Appliances are not initialized by default
		Television tvObj = null;
		AirConditioner acObj = null;
		IRemoteControllable remoteControlledAppliance = null;
		try 
		{
			do
			{
				System.out.println("\nEnter 1 for controlling TV");
				System.out.println("Enter 2 for controlling AC");
				System.out.println("Enter 3 for controlling Washing Machine");
				System.out.println("Enter 0 to EXIT\n");
				
				int applianceChoice = scAppliance.nextInt();
				if (applianceChoice > 0 )
				{
					boolean invalid_choice = false;
					switch(applianceChoice)
					{
						case 1:
							//If the TV was once used, reuse the object
							if(tvObj == null)
							{
								tvObj = new Television();
							}
							remoteControlledAppliance = tvObj;
							break;
						case 2:
							if(acObj == null)
							{
								acObj = new AirConditioner();
							}
							remoteControlledAppliance = acObj;
							break;
						default:
							invalid_choice = true;
							break;
					}
					if(!invalid_choice && remoteControlledAppliance != null)
					{
						boolean break_requested = false;
						do
						{						
							remoteControlledAppliance.displayStatus();						
							System.out.println("\nEnter 1 for Plus Button 1 ");
							System.out.println("Enter 2 for Minus Button 1 ");
							System.out.println("Enter 3 for Plus Button 2 ");
							System.out.println("Enter 4 for Minus Button 2 ");
							System.out.println("Enter 5 for Change Mode ");
							System.out.println("Enter 6 for power On/OFF ");
							System.out.println("Enter 0 to change appliance or Exit ");
							int remoteChoice = scRemote.nextInt();
							switch (remoteChoice)
							{
								case 0:
									break_requested=true;
									break;
								case 1:
									remoteControlledAppliance.plusButton1();
									remoteControlledAppliance.displayStatus();
									break;
								case 2:
									remoteControlledAppliance.minusButton1();
									remoteControlledAppliance.displayStatus();
									break;
								case 3:
									remoteControlledAppliance.plusButton2();
									remoteControlledAppliance.displayStatus();
									break;
								case 4:
									remoteControlledAppliance.minusButton2();
									remoteControlledAppliance.displayStatus();
									break;
								case 5:
									remoteControlledAppliance.changeMode();
									remoteControlledAppliance.displayStatus();
									break;
								case 6:
									remoteControlledAppliance.powerOnOff();
									remoteControlledAppliance.displayStatus();
									break;
								default:
									remoteControlledAppliance.displayStatus();
									break;							
							}
						}
						while(!break_requested);
					}
					else
					{
						System.out.println("\nInvalid Choice, please try again");
					}
				}
				else
				{
					System.out.println("\nBye\n");
					break;
				}
			}
			while(true);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		finally
		{
			//Cleanup
			scAppliance.close();
			scRemote.close();
			tvObj = null;
			acObj = null;
		}
	}

}
