package com.constructor;

public class Employee {
	private String name;
	private String compneyName;
	private double sal;
	private long idNo;

	public Employee(){//zero orgument constructor
	}
	
		 public Employee(String name,String compneyName,double sal,long idNo){
			this.name=name;
			this.compneyName=compneyName;
			this.sal=sal;
			this.idNo=idNo;
		}
	public void working() {
		System.out.println("working");
	
	}
	public static void main(String[] args) {
		Employee emp = new Employee("kalpana","IBM",234.56,239);
		System.out.println(emp.name);
		System.out.println(emp.compneyName);
		System.out.println(emp.sal);
		System.out.println(emp.idNo);
		emp.working();
		
	
		
	
	
	
	}
	
}

