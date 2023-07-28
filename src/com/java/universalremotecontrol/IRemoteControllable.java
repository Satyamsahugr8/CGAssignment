package com.java.universalremotecontrol;
public interface IRemoteControllable {
	//Button-Set1
	void plusButton1();
	void minusButton1();
	
	//Button-Set2
	void plusButton2();
	void minusButton2();
	
	//change Mode
	void changeMode();
	//Control Power
	void powerOnOff();
	
	void displayStatus();
}
