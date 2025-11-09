package practicepackage;

class B
{
	public B()
	{
		System.out.println("b constructor");
	}
}

public class A extends B
{
	public A()
	{	
		//this(10); //it has to be the first thing 
		System.out.println("child constructor");
	}
	
	public A(int i)
	{
		//super();
		System.out.println("paramenterized constructor");
	}
	public static void main(String[] args) 
	{
		A a1 = new A(); //to avoid creating too many objects
		
	}
}

