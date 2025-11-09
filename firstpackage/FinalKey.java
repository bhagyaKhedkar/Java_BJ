package firstpackage;

import java.util.Scanner;

public class FinalKey 
{
	final static double pi = 3.14;
	public static void main(String[] args)
	{
		area();
	}
	public static void area()
	{
		double r;
		Scanner s1= new Scanner(System.in);
		System.out.println("please enter radiuos of circle");
		r =s1.nextDouble();
		
		Double a = pi * r * r ;
		System.out.println("ärea of circle is :");
		System.out.println(a);
		s1.close();
	}
}
