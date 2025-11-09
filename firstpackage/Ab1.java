package firstpackage;

// This is new Edit
// This is second edit
public class Ab1 extends Ab2
{
	public static void main(String[] args)
	{
		Ab2 a = new Ab2();
		a.add();
		a.sub();
		a.div();
		
	}
}
 abstract class Ab
{
	abstract void add();
	abstract void sub();
	void div()
	{
		int a =10;
		int b =2 ;
		int d = a/b;
		System.out.println(d);
	}
}
 class Ab2 extends Ab
{

	
	void add() 
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
		
	}

	
	void sub() 
	{
		int a=1;
		int b=2;
		int c=a-b;
		System.out.println(c);
		
		
	}
	 
	
}
