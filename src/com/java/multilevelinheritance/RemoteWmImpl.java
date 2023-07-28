package com.java.multilevelinheritance;

public class RemoteWmImpl implements Remote { // implementing Remote to use its abstract method

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

	}

}
