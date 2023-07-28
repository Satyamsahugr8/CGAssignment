package com.java.assignment3;

//import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class A_StandardDeviationofArray {

	// main method is at #56 line

	double Sd = 0.0;
	double standardDeviationAdd = 0.0;

	double sum = 0.0;
	double mean = 0.0;

	// A purpose
	// here, below method is to find mean of the particular range taken as input
	// storing that in instance variable mean
	private void calMean(int arr, int lengthe) {
		sum += arr;
		mean = sum / lengthe;
	}
	
	
	// A purpose
	// here, below method is to find SD of the particular range taken as input
	// storing that in instance variable Sd
	private void calSdA(int num, double mean2, int length) {
		standardDeviationAdd = standardDeviationAdd + Math.pow(num - mean2, 2);
		Sd = Math.sqrt(standardDeviationAdd / length);
	}
	
    // B purpose
	// finding mean
	public synchronized void calmean(int i, int j) {
		sum += i;
		mean = sum / j;

	}
     
	// B purpose
	// adding element from array
	public synchronized void calsum(int i) {
		sum += i;

	}

	// B purpose
	// here we are giving some necessary inputs to find standard deviation
	public synchronized void calSd(int arr, double mean, int length) {
		standardDeviationAdd = standardDeviationAdd + Math.pow(arr - mean, 2);
		Sd = Math.sqrt(standardDeviationAdd / length);
	}

	
	
	public static void main(String[] args) {

		A_StandardDeviationofArray strd = new A_StandardDeviationofArray();

		// To find the standard deviation of any given set of data
		// We should have some Pre-requisite 1st given SET(Array) of data , MEANS of the
		// data , LENGTH of the data.

		// lets take arr as our Array
		int[] arr = new int[] { 78, 42, 176, 37, 121, 7, 3, 175, 169, 79, 48, 132, 12, 1, 153, 90, 171, 164, 17, 13, 87,
				100, 45, 122, 99, 109, 87, 54, 93, 89, 111, 39, 73, 120, 50, 40, 104, 37, 12, 160, 46, 64, 58, 160, 142,
				68, 30, 9, 156, 121, 169, 26, 121, 141, 7, 153, 99, 52, 59, 110, 165, 64, 36, 80, 129, 79, 69, 103, 115,
				59, 145, 27, 109, 131, 64, 3, 49, 144, 115, 176, 33, 36, 17, 31, 90, 118, 75, 174, 70, 150, 21, 54, 123,
				164, 135, 175, 152, 0, 100, 10 };

		// taking length of array
		int length = arr.length;
		
		// this loop for finding means
		for(int i = 0; i < 100; i++) {
			strd.calMean(arr[i], i + 1);
		}
		
//		System.out.println("mean from A = " + strd.mean); // mean from A = 87.00

		// this below loop is for calling calSdA method in which calculation of standard
		// deviation takes place.
		for (int num : arr) {
			strd.calSdA(num, strd.mean, length); // (int , double, int)
		}

		System.out.println("Standard Deviation from A = " + strd.Sd); // Standard Deviation from A = 52.73006732406095
	}

	

}
