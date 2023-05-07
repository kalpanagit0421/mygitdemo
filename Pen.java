package com.constructor;

public class Pen {
	
String name;
int cost;
String address; 

public Pen() {
	System.out.println("zero orgment constructure");
}

public Pen(String name, int cost, String address) {
	
	this.name = name;
	this.cost = cost;
	this.address = address;
}
void writing() {
	System.out.println("writing");
	
}

	public static void main(String[] args) {
		Pen p=new Pen();//default constructor
		System.out.println("pen cosr is="+p.cost);
p.writing();

Pen p1=new Pen("cello",100,"vzm");
System.out.println(p1.name);
System.out.println(p1.cost);
System.out.println(p1.address);
	}


}


