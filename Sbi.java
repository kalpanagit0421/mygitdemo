package com.oops;

public class Sbi implements IAtm{

	@Override
	public double getIntrest() {
		return 7.5;
		
	}
	public static void main(String[] args) {
		IAtm atm = new Hdfc();
		System.out.println(atm.getIntrest());
	}

}
