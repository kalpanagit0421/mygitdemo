package com.arrays;

public class Array {
	public static void main(String[] args) {
		//datatype array[]=new datatype [size]
		
	//	print all array elements
		double[] arr = {1.9,3.7,2.2,4.3};
		for (int i = 0;i < arr.length; i++) {
			System.out.println(arr[i] +" ");
		}
		//print total elements
		double total = arr[0];
		for(int i = 0;i < arr.length; i++) {
			total += arr[i];
		}
			System.out.println("total is=" +total);
		
	//large number
	double max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)max=arr[i];
	}
	System.out.println("max="+max);
	}}
