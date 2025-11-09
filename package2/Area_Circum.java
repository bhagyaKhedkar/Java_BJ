package package2;
import java.lang.Math;
import java.util.Scanner;
public class Area_Circum 
{
	//static double radius ;
	static double area;
	static double circum;
	double result;
	
	static void area(int a)
	{
		System.out.println("enter the radius of the circle:");
		//Scanner s1 = new Scanner (System.in);
		int radius = a ; // s1.nextInt();
		assert radius > 0 : "radius should be positive";
		area = Math.PI * radius * radius ;
		System.out.println("area of the circle is: "+area);
	}
	static void circumference()
	{
		Area_Circum ar = new Area_Circum();
				System.out.println("enter the radius of the circle:");
		Scanner s1 = new Scanner (System.in);
		double radius = s1.nextDouble();
		assert radius >0 : "radius should be positive";

		ar.result = 2* Math.PI * radius;
		System.out.println("circumference of the circle is: "+ar.result);
	}
	
	public static void main(String args[])
	{
		System.out.println(args[0]);
		area(Integer.parseInt(args[0]));
		circumference();
	}
}
