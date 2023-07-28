package com.java.assignment3;

public class B_StandardDeviationOfArrayUsingMultipleThreading {

	public static void main(String[] args) throws Exception {

		A_StandardDeviationofArray strd1 = new A_StandardDeviationofArray();

		// lets take this as our array set
		int[] arr = new int[] { 78, 42, 176, 37, 121, 7, 3, 175, 169, 79, 48, 132, 12, 1, 153, 90, 171, 164, 17, 13, 87,
				100, 45, 122, 99, 109, 87, 54, 93, 89, 111, 39, 73, 120, 50, 40, 104, 37, 12, 160, 46, 64, 58, 160, 142,
				68, 30, 9, 156, 121, 169, 26, 121, 141, 7, 153, 99, 52, 59, 110, 165, 64, 36, 80, 129, 79, 69, 103, 115,
				59, 145, 27, 109, 131, 64, 3, 49, 144, 115, 176, 33, 36, 17, 31, 90, 118, 75, 174, 70, 150, 21, 54, 123,
				164, 135, 175, 152, 0, 100, 10 };

		// length of array
		int length = arr.length;
		
		

		// Here i have created different threads (tA,tB,tC,tD,tE) for calculation of
		// mean
		// Here below I have created 5 threads for calculating mean of the given array
		// So we have 100 integers so each threads is working simultaneously on there
		// threads
		// so lets think tA thread is going upto 20 element
		// then tB thread is going upto next 20 element
		// and so no.

		
		
		  //
		 // MEAN
		//

		Thread tA = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				if( i != 19)
					strd1.calsum(arr[i]); // (int , int)
				else
					strd1.calmean(arr[i],i+1);
			}
		});
		
		
		Thread tB = new Thread(() -> {
			for (int i = 20; i < 40; i++) {
				if( i != 39)
					strd1.calsum(arr[i]); // (int , int)
				else
					strd1.calmean(arr[i],i+1);
			}
		});
		
		Thread tC = new Thread(() -> {
			for (int i = 40; i < 60; i++) {
				if( i != 59)
					strd1.calsum(arr[i]); // (int , int)
				else
					strd1.calmean(arr[i],i+1);
			}
		});
		
		
		Thread tD = new Thread(() -> {
			for (int i = 60; i < 80; i++) {
				if( i != 79)
					strd1.calsum(arr[i]); // (int , int)
				else
					strd1.calmean(arr[i],i+1);
			}
		});
		
		Thread tE = new Thread(() -> {
			for (int i = 80; i < 100; i++) {
				if( i != 99)
					strd1.calsum(arr[i]); // (int , int)
				else
					strd1.calmean(arr[i],i+1);
			}
		});

		// here i have started the thread using threadname.start(); method
		tA.start();
		tB.start();
		tC.start();
		tD.start();
		tE.start();

		// here i am asking the Main thread to stop till t1 joins the main thread
		// and for other threads too.
		tA.join();
		tB.join();
		tC.join();
		tD.join();
		tE.join();

//		System.out.println("mean from B = " + strd1.mean); // mean from B = 87.0

		
		
		
		

		
		  //
		 // STANDARD DEVIATION
		//
		
		
		// Here i have created 5 threads t1,t2,t3,t4,t5
		// So we have 100 integers so each threads is working simultaneously on there
		// threads
		// so lets think t1 thread is going upto 20 element
		// then t2 thread is going upto next 20 element
		// and so no.
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				strd1.calSd(arr[i], strd1.mean, length); // (int , double, int)
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 20; i < 40; i++) {
				strd1.calSd(arr[i], strd1.mean, length);
			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 40; i < 60; i++) {
				strd1.calSd(arr[i], strd1.mean, length);
			}
		});

		Thread t4 = new Thread(() -> {
			for (int i = 60; i < 80; i++) {
				strd1.calSd(arr[i], strd1.mean, length);
			}
		});

		Thread t5 = new Thread(() -> {
			for (int i = 80; i < 100; i++) {
				strd1.calSd(arr[i], strd1.mean, length);
			}
		});

		// here i have started the thread using threadname.start(); method
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// here i am asking the Main thread to stop till t1 joins the main thread
		// and for other threads too.
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		// here i am calling the updated Sd or standard Deviation from the
		// StandardDeviation class
		System.out.println("Standard Deviation from B = " + strd1.Sd); // Standard Deviation from B = 52.73006732406095

	}

}
