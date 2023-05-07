package com.constructor;

public class Dog {
		String color;
		String eating;
		double price;
		
	
	Dog(String color,String eating,double price){
		this.color=color;
		this.eating=eating;
		this.price=price;
		
		
	}
	//zero org constructor
	 Dog() {
		 System.out.println("zero org constructur");
	
	}
	void barking() {
		System.out.println("barking");
}
	public static void main(String[] args) {
		
		Dog d=new Dog("black","food",44.33);
		System.out.println(d.color);
		System.out.println(d.eating);
		System.out.println(d.price);
		
		Dog d1=new Dog();//default constructure
		System.out.println("color is:"+d1.color);
		d1.barking();
	}
	
}

