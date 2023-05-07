package com.arrays;

public class LargeSmallNo {
	public static void main(String[] args) {
		int num[]= {10,20,40,55,8,1};
		int Largest=num[0];
		int Smallest=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>Largest)
				Largest=num[i];
			else if(num[i]<Smallest);
			Smallest=num[i];
		}
		System.out.println("Largest number is="+Largest);
		System.out.println("Smallest number is="+Smallest);
			
		
		}
	}


