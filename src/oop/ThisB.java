package oop;

public class ThisB {
	String car ;
	String model;
	int year;
	public ThisB() {
		System.out.println("hi");
	}
	
	
	
	public ThisB(String car, String model,int year) {
	this();
	this.car = car;
	this.model = model;
	this.year = year;
	System.out.println("The car name is " + car +" " + model);
	System.out.println("The car year is "+ year);
	    
	}

}
