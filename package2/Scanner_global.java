package package2;
import java.util.Scanner;
public class Scanner_global 
{
	static Scanner s1 = new Scanner(System.in);
	static int a;
	static int b;
	
	static void add()
	{
		
		System.out.println("enter the two numbers:");
		a=s1.nextInt();
		b=s1.nextInt();
		int result = a+b;
		System.out.println("sum is : "+result);
	}
	void sub()
	{
		System.out.println("enter the two numbers:");
		a=s1.nextInt();
		b=s1.nextInt();
		int result = a-b;
		System.out.println("difference is : "+result);
	}
	public static void main(String[] args) {
		add();
		Scanner_global sg = new Scanner_global();
		sg.sub();
	}
}
