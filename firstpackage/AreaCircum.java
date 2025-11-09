package firstpackage;

import java.util.Scanner;

public class AreaCircum 
{
	Scanner s1 = new Scanner(System.in);
	static void circleArea()
	{
		double r;
		AreaCircum a = new AreaCircum();
		
		System.out.println("Please enter the value of radius");
		r= a.s1.nextDouble();
		double Area = Math.PI * r * r;
		System.out.println("the area of circle is :");
		System.out.println(Area);
		
	}
	
	static void circleCircum()
	{
		double r;
		AreaCircum a = new AreaCircum();
		//Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of radius");
		r= a.s1.nextDouble();
		double circum = 2 * Math.PI * r;
		System.out.println("the circumference of circle is :");
		System.out.println(circum);
		//s1.close();
	}
	
	static void triangleArea()
	{
		double b;
		double h;
		AreaCircum a = new AreaCircum();
		//Scanner s1 = new Scanner(System.in);
		System.out.println("please enter the value of breadth b");
		b = a.s1.nextDouble();
		System.out.println("please enter the value of height h");
		h = a.s1.nextDouble();
		double Area = 0.5 * b* h;
		System.out.println("Area of triangle is :");
		System.out.println(Area);
		//s1.close();
	}
	static void triangleCircum()
	{
		double a1;
		double b;
		double c;
		AreaCircum a = new AreaCircum();
		//Scanner s1 = new Scanner(System.in);
		System.out.println("please enter the value of a");
		a1 = a.s1.nextDouble();
		System.out.println("please enter the value of b");
		b = a.s1.nextDouble();
		System.out.println("please enter the value of c");
		c = a.s1.nextDouble();
		double circum = a1 + b + c;
		System.out.println("circumference of triangle is :");
		System.out.println(circum);
		//s1.close();
	}
	
	static void rectangleArea()
	{
		double a1 ;
		double b;
		AreaCircum a = new AreaCircum();
		//Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of side a ");
		a1 = a.s1.nextDouble();
		System.out.println("please enter the value of other side b");
		b = a.s1.nextDouble();
		double area = a1 * b;
		System.out.println("area of rectangle is :");
		System.out.println(area);
		//s1.close();
		
	}
	
	static void rectangleCircum()
	{
		double a ;
		double b;
		
		AreaCircum c = new AreaCircum();
		//Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of side a ");
		a = c.s1.nextDouble();
		System.out.println("please enter the value of other side b");
		b = c.s1.nextDouble();
		double Circum = 2*(a+b);
		System.out.println("circumference of rectangle is :");
		System.out.println(Circum);
		//s1.close();
		
	}
	
	static void SquareArea()
	{
		double a;
		//Scanner s1 = new Scanner(System.in);
		AreaCircum c = new AreaCircum();
		System.out.println("Please enter the value of side a");
		a = c.s1.nextDouble();
		double area = a * a;
		System.out.println("The area of square is :");
		System.out.println(area);
		//s1.close();
	}
	static void SquareCircum()
	{
		double a;
		//Scanner s2 = new Scanner(System.in);
		AreaCircum c = new AreaCircum();
		System.out.println("Please enter the value of side a");
		a = c.s1.nextDouble();
		double circum = 4 * a;
		System.out.println("The circumference of square is :");
		System.out.println(circum);
		//s2.close();
	}
	
	public static void main(String[] args) 
	{
		circleArea();
		triangleArea();
		SquareArea();
		rectangleArea();
		circleCircum();
		triangleCircum();
		SquareCircum();
		rectangleCircum();
	}
}
