package com.java.multilevelinheritance;

public class RemoteTvImpl implements Remote { // implementing Remote to use its abstract method 

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

	}

}
