package firstpackage;

public class accessSpecifier1
{
	/*protected accessSpecifier1(int i)
	{
		System.out.println("protected constructor");
	}*/
	public void add()
	{
		System.out.println("public method");
	}
	private void sub()
	{
		System.out.println("private method");
	}
	void mul()
	{
		System.out.println("default method");
	}
	protected void div()
	{
		System.out.println("protected method");
	}
	
	public static void main(String[] args)
	{
		accessSpecifier1 a1 = new accessSpecifier1();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		
	}
			
}
