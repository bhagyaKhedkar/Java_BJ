package practicepackage;

public class CallingStaticMenthod {
	public static void Add() {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Add(); // we can call a static method in the main method of same class by directly
				// calling it

	}

}
