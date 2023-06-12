package oop;

public class ThisA {
	String name;
	String fName;
	int age;
	 
	public void myMethod (String name, String fName , int age ) {
		this. name = name;
		this. fName = fName;
		this. age = age;
		 this.wish();
	}
	 public void wish () {
		 System.out.println("His name is " + name + " " + fName);
		 System.out.println("His age is " + age);
	 }

}
