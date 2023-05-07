package com.arrays;

public class EvenOddNum {
	public static void main(String[] args) {
		int number[]=  {1,2,3,4,5,6,7,8,9,11,12};
		for(int i =0;i<number.length;i++) {
			if(number[i]%2==0) 
				System.out.println(number[i]+"evenNumber");
			else
				System.out.println(number[i]+"oddNumber");
			}
		}
	}


