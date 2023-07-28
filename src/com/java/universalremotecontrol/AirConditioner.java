package com.java.universalremotecontrol;

public class AirConditioner implements IRemoteControllable {

	public AirConditioner() {
		//Before even PoweredOn, TV will be in this default state
		currentTemp = 21;
		currentFanSpeed = 2;
		currentMode = ACModes.Cool;
		IsPoweredOn = false; 
	}
	
	int currentTemp;
	int maxTemp=29;
	int minTemp=18;
	int currentFanSpeed;
	int maxFanSpeed=3;
	int minFanSpeed=0;
	boolean IsPoweredOn;
	
	enum ACModes
	{
		Cool,
		Dry,
		Fan
	};	
	
	ACModes currentMode;

	@Override
	public void plusButton1() {
		currentFanSpeed = currentFanSpeed + 1;
		if(currentFanSpeed > maxFanSpeed)
		{
			currentFanSpeed = maxFanSpeed;
		}
	}

	@Override
	public void minusButton1() {
		currentFanSpeed = currentFanSpeed - 1;
		if(currentFanSpeed < minFanSpeed)
		{
			currentFanSpeed = minFanSpeed;
		}
	}

	@Override
	public void plusButton2() {
		currentTemp = currentTemp + 1;
		if(currentTemp > maxTemp)
		{
			currentTemp = maxTemp;
		}
	}

	@Override
	public void minusButton2() {
		currentTemp = currentTemp - 1;
		if(currentTemp < minTemp)
		{
			currentTemp = minTemp;
		}
	}

	@Override
	public void changeMode() {
		//Cycle the modes 
		switch (currentMode) {
		case Cool:
			currentMode = ACModes.Dry;
			break;
		case Dry:
			currentMode = ACModes.Fan;
			break;
		case Fan:
			currentMode = ACModes.Cool;
			break;	
		}		
	}

	@Override
	public void powerOnOff() {
		IsPoweredOn = !(IsPoweredOn);
	}

	@Override
	public void displayStatus() {
		System.out.println(String.format("\nCurrent Air-Conditioner Status\nCurrent Temp: %d\nCurrent Fan-Speed: %d\nCurrent Mode: %s\nCurrent State:%s",this.currentTemp, this.currentFanSpeed, this.currentMode.toString(), this.IsPoweredOn?"On":"OFF"));		
	}


}
