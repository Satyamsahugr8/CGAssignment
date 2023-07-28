package com.java.assignment3;

//import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class A_StandardDeviationofArray2 {

	// main method is at 40 line

	double Sd;
	double standardDeviationAdd;

	double sum;
	double mean;

	int[] arr = new int[] { 78, 42, 176, 37, 121, 7, 3, 175, 169, 79, 48, 132, 12, 1, 153, 90, 171, 164, 17, 13, 87,
			100, 45, 122, 99, 109, 87, 54, 93, 89, 111, 39, 73, 120, 50, 40, 104, 37, 12, 160, 46, 64, 58, 160, 142, 68,
			30, 9, 156, 121, 169, 26, 121, 141, 7, 153, 99, 52, 59, 110, 165, 64, 36, 80, 129, 79, 69, 103, 115, 59,
			145, 27, 109, 131, 64, 3, 49, 144, 115, 176, 33, 36, 17, 31, 90, 118, 75, 174, 70, 150, 21, 54, 123, 164,
			135, 175, 152, 0, 100, 10 };

	int length = arr.length;

    // here, below method is to find mean of the particular range taken as input storing that in instance variable mean
	public synchronized void calMean(int arr, int lengthe) {
		sum += arr;
		mean = sum/lengthe;
		}

	// here, giving some necessary inputs to find standard deviation
	public synchronized void calSd(int arr, double mean, int length) {
		standardDeviationAdd = standardDeviationAdd + Math.pow(arr - mean, 2);
		Sd = Math.sqrt(standardDeviationAdd / length);
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		A_StandardDeviationofArray2 strd = new A_StandardDeviationofArray2();
		
		// To find the standard deviation of any given set of data
		// We should have some Pre-requisite 1st given SET(Array) of data , MEANS of the data , LENGTH of the data.

		// In this below loop which is for calling calMean method in which calculation of means takes place.

		for (int i = 0; i < 100; i++) {
			strd.calMean(strd.arr[i],i+1);
			}
		//System.out.println("mean from A = "+strd.mean); // mean from A = 87.00
		
		// In this below loop which is for calling calSd method in which calculation of StandardDeviation takes place.
		for (int num : strd.arr) {
			strd.calSd(num, strd.mean, strd.length); // (int , double, int)
			}
		System.out.println("Standard Deviation = " + strd.Sd); // Standard Deviation = 52.73006732406095
		}
}
