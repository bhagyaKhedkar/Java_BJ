package practicepackage;

class BaseClass {
	BaseClass() {
		//this(100); // this () calling statement used to call the constructor within same class
		// this() should be first statement in a constructor
		// this() used to create constructor chaining within a class
		// constructor chaining is calling one constructor from another constructor

		System.out.println("non parameterized constructor of parent class");
	}

	BaseClass(int i) {
		//this("Bhagya");
		System.out.println("int parameterized constructor of parent class");
	}

	BaseClass(String s) {
		System.out.println("string parameterized constructor of parent class");
	}
	void add()
	{
		
	}
}

public class ConstructorChaining extends ConstrutorPractice {
	ConstructorChaining() {
		super(); // super() calling statement is used to call the parent class constructor
		// it will get executed when the child class object is created
		// hence it makes sure the parent class members are initilized whenever the
		// child object is
		// created , by calling parent constructor
		System.out.println("child class constructor is executed");
	}
	

	public static void main(String[] args) {

		//ConstructorChaining cc1 = new ConstructorChaining();
		new ConstructorChaining();
		
	}
}

//constructor chaining : the process of calling constructor from one another constructor is called construtor
//chaining . it is achieved using super() and this()
//when we call a constructor from super() or this() calling statemtn we dont create a new object 
//hence we can avoid creating new objects un-necessarily and save space and improve readablility of the code 
//we can not use this() and super () in the same constructor
//constructor chaining between multiple classes is possible by the concept of inheritance and super () statement 
//.constructor chaining withing same  class is possible by the concept of this () statement 
