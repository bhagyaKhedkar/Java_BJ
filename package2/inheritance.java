package package2;

import practicepackage.SuperCallingstatement;

//multi level inheritance
class parent11
{
	void add()
	{
		System.out.println("addingg...");
	}
}
class parent1 extends parent11
{
	int a =10;
	int b =10;
	parent1()
	{
		System.out.println("parent constructo-non parameterized");
	}
	parent1(int a)
	{
		this();
		System.out.println("parent constructor -parameterized");
	}
	void sub(int a , int b)
	{
		int c = this.a-this.b;
		System.out.println("subtracting..."+c);
	}
}
public class inheritance extends parent1
{
	inheritance()
	{
		this(7);
		System.out.println("child constructor-non parameterized");
	}
	inheritance(int x)
	{
		super(9);
		System.out.println("child constructor-parameterized");
	}
	void sub()
	{
		super.sub(20,1);//to call parent class sub method
		System.out.println("child sub method..");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		inheritance i = new inheritance ();
		
		i.sub();
		
	}
}
