package firstpackage;


class calculate
{
	calculate(int i)
	{
		int a =10;
		int b =19;
		int sum = a + b;
		System.out.println(sum);
		System.out.println("printing the constructor called by this");
	}
	calculate(int i , int j)
	{
		this(2);
		int diff = i - j;
		System.out.println(diff);
		System.out.println("printing the constructor called by super");
	}
	/*public calculate()
	{
		this(2);
		
	}*/
}

public class claculatorSuper extends calculate
{
	claculatorSuper()
	{
		super(3,2);
		System.out.println("Printing child constructor");
	}
	public static void main(String[] args)
	{
		new claculatorSuper();
	}
	
}
