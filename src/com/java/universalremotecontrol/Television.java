package com.java.universalremotecontrol;
public class Television implements IRemoteControllable {
	
	int currentChannelNumber;
	int maxChannelNumber=999;
	int minChannelNumber=100;
	int currentVolume;
	int maxVolume=10;
	int minVolume=0;
	boolean IsPoweredOn;
	
	enum TVModes
	{
		TV,
		AV,
		HDMI,
		PC
	};	
	
	TVModes currentMode;

	public Television() {
		//Before even PoweredOn, TV will be in this default state
		currentChannelNumber = 100;
		currentVolume = 3;
		currentMode = TVModes.TV;
		IsPoweredOn = false; 
	}

	@Override
	public void plusButton1() {
		currentVolume = currentVolume + 1;
		if(currentVolume > maxVolume)
		{
			currentVolume = maxVolume;
		}
	}

	@Override
	public void minusButton1() {
		currentVolume = currentVolume - 1;
		if(currentVolume < minVolume)
		{
			currentVolume = minVolume;
		}
	}

	@Override
	public void plusButton2() {
		currentChannelNumber = currentChannelNumber + 1;
		if(currentChannelNumber > maxChannelNumber)
		{
			currentChannelNumber = minChannelNumber;
		}
	}

	@Override
	public void minusButton2() {
		currentChannelNumber = currentChannelNumber - 1;
		if(currentChannelNumber < minChannelNumber)
		{
			currentChannelNumber = maxChannelNumber;
		}
	}

	@Override
	public void changeMode() {
		switch (currentMode) {
		case TV:
			currentMode = TVModes.AV;
			break;
		case AV:
			currentMode = TVModes.HDMI;
			break;
		case HDMI:
			currentMode = TVModes.PC;
			break;
		case PC:
			currentMode = TVModes.TV;
			break;		
		}		
	}

	@Override
	public void powerOnOff() {
		IsPoweredOn = !(IsPoweredOn);
	}

	@Override
	public void displayStatus() {
		System.out.println(String.format("\nCurrent Television Status\nCurrent Channel: %d\nCurrent Volume: %d\nCurrent Mode: %s\nCurrent State:%s",this.currentChannelNumber, this.currentVolume, this.currentMode.toString(), this.IsPoweredOn?"On":"OFF"));		
	}

}
