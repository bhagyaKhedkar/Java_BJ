package firstpackage;

public class staticMethod 
{
	public static void Add()
	{
		int a = 10;
		int b =20;
		int c = a + b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Add();
		System.out.println("static method called inside main method successfully ");
	}
}
