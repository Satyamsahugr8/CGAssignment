package com.java.multipleinheritance;

public class RemoteImpl implements TvRemote, AcRemote, WmRemote { // This is how multiple inheritance works here

	@Override
	public void powerButton() {
		System.out.println(" PowerOff ");
	}

	
	
	// button1 is for volume
		@Override
		public int tvplusButton1(int volume) {
			int ivolume = 10;
			if (volume < 10) {
				ivolume = volume + 1;
				System.out.println("volume " + ivolume);
			} else
				System.out.println("volume " + ivolume);
			return ivolume;
		}

		@Override
		public int tvminusButton1(int volume) {
			int ivolume = 0;
			if (volume > 0) {
				ivolume = volume - 1;
				System.out.println("volume " + ivolume);
			} else
				System.out.println("volume " + ivolume);
			return ivolume;
		}

		// button2 is for channel
		@Override
		public int tvplusButton2(int channel) {
			int ichannel = 100;
			if (channel < 100) {
				ichannel = channel + 1;
				System.out.println("channel " + ichannel);
			} else
				System.out.println("channel" + ichannel);
			return ichannel;
		}

		@Override
		public int tvminusButton2(int channel) {
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
		// TODO Auto-generated method stub
		
	}

	// button1 is for spin speed
		@Override
		public int wmplusButton1(int wmSpeed) {
			int iwmSpeed = 10;
			if (wmSpeed < 10) {
				iwmSpeed = wmSpeed + 1;
				System.out.println("spin speed " + iwmSpeed);
			} else
				System.out.println("spin speed " + iwmSpeed);
			return iwmSpeed;
		}

		@Override
		public int wmminusButton1(int wmSpeed) {
			int iwmSpeed = 0;
			if (wmSpeed > 0) {
				iwmSpeed = wmSpeed - 1;
				System.out.println("spin speed " + iwmSpeed);
			} else
				System.out.println("spin speed " + iwmSpeed);
			return iwmSpeed;
		}

		// button2 is for speed
		@Override
		public int wmplusButton2(int wmSpeed) {
			int iwmSpeed = 10;
			if (wmSpeed < 10) {
				iwmSpeed = wmSpeed + 1;
				System.out.println("spin speed " + iwmSpeed);
			} else
				System.out.println("spin speed " + iwmSpeed);
			return iwmSpeed;
		}

		@Override
		public int wmminusButton2(int wmSpeed) {
			int iwmSpeed = 0;
			if (wmSpeed > 0) {
				iwmSpeed = wmSpeed - 1;
				System.out.println("spin speed " + iwmSpeed);
			} else
				System.out.println("spin speed " + iwmSpeed);
			return iwmSpeed;
		}

	// button1 is for temperature
		@Override
		public int acplusButton1(int temp) {
			int itemp = 40;
			if (temp < 40) {
				itemp = temp + 1;
				System.out.println("temperature " + itemp);
			} else
				System.out.println("temperature " + itemp);
			return itemp;
		}

		@Override
		public int acminusButton1(int temp) {
			int itemp = 25;
			if (temp > 25) {
				itemp = temp - 1;
				System.out.println("temperature " + itemp);
			} else
				System.out.println("temperature " + itemp);
			return itemp;
		}

		// button2 is for fan speed
		@Override
		public int acplusButton2(int acSpeed) {
			int iacSpeed = 100;
			if (acSpeed < 100) {
				iacSpeed = acSpeed + 1;
				System.out.println("fan speed " + iacSpeed);
			} else
				System.out.println("fan speed " + iacSpeed);
			return iacSpeed;
		}

		@Override
		public int acminusButton2(int acSpeed) {
			int iacSpeed = 0;
			if (acSpeed > 0) {
				iacSpeed = acSpeed - 1;
				System.out.println("fan speed " + iacSpeed);
			} else
				System.out.println("fan speed " + iacSpeed);
			return iacSpeed;
		}



	

}
