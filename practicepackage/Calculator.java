package practicepackage;

public class Calculator {
	// lets write 5 non static methods in the program for each operator
	// then call them in the main method

	float a; // if you make a ,b as int => it will give division output as 0
	// because in java if you give int to divide then it gives int as output even if
	// u declare the output
	// as float, hence one or either of operators has to be float in order to get
	// 0.5 for 1/2
	float b;
	float c;

	public void add() {
		c = a + b;
		System.out.println(c);
	}

	public void sub() {
		c = a - b;
		System.out.println(c);
	}

	public void mul() {
		c = a * b;
		System.out.println(c);
	}

	public void div() {
		c = a / b;
		System.out.println(c);
	}

	public void mod() {
		c = a % b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		// c1.div();
		// c1.mod();
	}

}
//when you do not initialize the varibles in the class and create an object of that class
//the default constructor will be called if no constructor is written eplicitely 
//and it will initialize all the no static variables 
//hence constructor is necessary to create an object therefore even if we dont write one 
//the java will give default 

//constructor overloading : is done when you want to create object with different parameters
//there comes the topic of parameterized constructors.