
package package2;

public class calculator {

	void add()
	{
		int a =10;
		int b=20;
		int c =a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a =10;
		int b=20;
		int c =a-b;
		System.out.println(c);
	}
	void mul()
	{
		int a =10;
		int b=20;
		int c =a*b;
		System.out.println(c);
	}
	void div()
	{
		int a =10;
		int b=20;
		int c =a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		calculator c=new calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
	
}
