package firstpackage;

public class arithOperators
{

	public static void main(String[] args)
	{
	 add();
	 sub();
	 mul();
	 div();
	 mod();
	 System.out.println("ärithmetic operators executed successfully" );
	}
	
	static void add()
	{
		int a = 20;
		int b = 10;
		int c;
		c = a + b;
		System.out.println(c);
	}
	static void sub()
	{
		int a = 20;
		int b = 10;
		int c;
		c = a -b ;
		System.out.println(c);
	}
	static void mul()
	{
		int a = 20;
		int b = 10;
		int c;
		c = a * b ;
		System.out.println(c);
	}
	static void div()
	{
		int a = 20;
		int b = 10;
		int c;
		c = a/b ;
		System.out.println(c);
	}
	static void mod()
	{
		int a = 20;
		int b = 10;
		int c;
		c = a %b ;
		System.out.println(c);
	}
	
	
}
