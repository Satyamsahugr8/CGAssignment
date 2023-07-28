package com.java.multilevelinheritance;

public class RemoteAcImpl implements Remote { // implementing Remote to use its abstract method

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
		int iacSpeed = 100;
		if (acSpeed < 100) {
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

	}

}
