package firstpackage;

class parentClass
{
	parentClass()
	{
		this(2);
		System.out.println("parent class NPC ");
	}
	parentClass(int a)
	{
		this(3.3);
		System.out.println("parent class int constructor ");
	}
	parentClass(double b)
	{
		this('p');
		System.out.println("parent class double constructor");
	}
	parentClass(char c)
	{
		this("java");
		System.out.println("parent class char constructor");
		
	}
	parentClass(String d)
	{
		System.out.println("parent class string constructor");
	}
}

public class childClass extends parentClass
{
	
	childClass()
	{
		this(1);
		System.out.println("Child class NPC ");
	}
	childClass(int a)
	{
		this( 2.22);
		System.out.println("Child class Int constructor ");
	}
	childClass(double b)
	{
		this('s');
		System.out.println("Child class double constructor ");
	}
	childClass(char c)
	{
		this("string");
		System.out.println("Child class char constructor ");
	}
	childClass(String d)
	{
		super();
		System.out.println("Child class string constructor ");
	}
	
	public static void main(String[] args) 
	{
		new childClass();
	}
}
