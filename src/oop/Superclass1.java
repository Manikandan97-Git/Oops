package oop;

public class Superclass1 extends Superclass{
	String name = "Wick";
	int age = 25;
	
	public void same () {
		System.out.println("His name and age is " + name + " " + age);
		super.same();
	}
	public static void main (String [] args) {
	Superclass1 obj3 = new Superclass1();
    obj3.same();
}
}