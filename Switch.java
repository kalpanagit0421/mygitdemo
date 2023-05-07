package com.ssd.corejava;

public class Switch {
	public static void main(String[] args) {
		int markes=60;
		switch(markes) {
		case 20:System.out.println("c grade");
		break;
		case 40:System.out.println("b grade");
		break;
		case 60:System.out.println("a grade");
		break;
		default:System.out.println("invalid");
		}
		System.out.println("your marks"+markes);
	}

}
