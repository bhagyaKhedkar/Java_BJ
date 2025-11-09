package firstpackage;

import java.util.Scanner;

public class ScannerGlobal 
{
	Scanner s1 = new Scanner(System.in);
	public static void main(String[] args)
	{
		add(2,3);
		ScannerGlobal sg1 = new ScannerGlobal();
		sg1.sub(9, 3);
	}
	private void sub(int a, int b)
	{
		
		int output = a - b;
		System.out.println("Difference of two numbers is:");
		System.out.println(output);
	}
	private static void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("sum of two numbers is:");
		System.out.println(sum);
		
	}

	
}
