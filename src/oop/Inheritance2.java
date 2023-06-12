package oop;

public class Inheritance2 extends Inheritance1 {
	String son = "Carey";
	String daughterInLaw = "Mickey";

	public void sonFamily() {
		System.out.println("Son name is " + son);
		System.out.println("Daughterinlaw name is " + daughterInLaw);

	}

	public static void main(String[] args) {
		Inheritance2 object = new Inheritance2();
		object.grandFatherFamily();
		object.fatherFamily();
		object.sonFamily();

	}
}
