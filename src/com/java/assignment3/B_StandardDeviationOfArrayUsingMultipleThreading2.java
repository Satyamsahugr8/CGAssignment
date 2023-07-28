package com.java.assignment3;

public class B_StandardDeviationOfArrayUsingMultipleThreading2 {

	public static void main(String[] args) throws Exception {

		A_StandardDeviationofArray2 strd = new A_StandardDeviationofArray2();
		
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
				strd.calMean(strd.arr[i], i + 1); // (int , int)
			}
		});
		Thread tB = new Thread(() -> {
			for (int i = 20; i < 40; i++) {
				strd.calMean(strd.arr[i], i + 1); // (int , int)
			}
		});
		Thread tC = new Thread(() -> {
			for (int i = 40; i < 60; i++) {
				strd.calMean(strd.arr[i], i + 1); // (int , int)
			}
		});
		Thread tD = new Thread(() -> {
			for (int i = 60; i < 80; i++) {
				strd.calMean(strd.arr[i], i + 1); // (int , int)
			}
		});
		Thread tE = new Thread(() -> {
			for (int i = 80; i < 100; i++) {
				strd.calMean(strd.arr[i], i + 1); // (int , int)
			}
		});

		tA.start();
		tB.start();
		tC.start();
		tD.start();
		tE.start();

		tA.join();
		tB.join();
		tC.join();
		tD.join();
		tE.join();
		
		System.out.println("mean from B = " + strd.mean);  // mean from B = 87.0

		
		
		
		
		//
		// STANDARD DEVIATION
		//

		// Here i have created 5 threads
		// So we have 100 integers so each threads is working simultaneously on there
		// threads
		// so lets think t1 thread is going upto 20 element

		// then t2 thread is going upto next 20 element

		// and so no.
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				strd.calSd(strd.arr[i], strd.mean, strd.length); // (int , double, int)
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 20; i < 40; i++) {
				strd.calSd(strd.arr[i], strd.mean, strd.length); // (int , double, int)
			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 40; i < 60; i++) {
				strd.calSd(strd.arr[i], strd.mean, strd.length); // (int , double, int)
			}
		});

		Thread t4 = new Thread(() -> {
			for (int i = 60; i < 80; i++) {
				strd.calSd(strd.arr[i], strd.mean, strd.length); // (int , double, int)
			}
		});
		Thread t5 = new Thread(() -> {
			for (int i = 80; i < 100; i++) {
				strd.calSd(strd.arr[i], strd.mean, strd.length); // (int , double, int)
			}
		});

		// here i have started the thread using threadname.start(); method

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// here i asking the Main thread to stop till t1 joins the main thread and for
		// other threads too.

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		// here i am calling the updated Sd or standard Deviation from the
		// A_StandardDeviationofArray2 class
		System.out.println("Standard Deviation using MT = " + strd.Sd);// Standard Deviation using MT =
																		// 52.73006732406095

	}

}
