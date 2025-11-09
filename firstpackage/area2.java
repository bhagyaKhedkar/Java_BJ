package firstpackage;
import java.util.*;
public class area2
{
public static Scanner s1 = new Scanner(System.in);
static double a ;
static double b;
static double c;
static double area;
static double circum;

public static void main(String[] args)
{
    CircleArea();
	CircleCircum();
	triangleArea();
	triangleCircum();
	rectangleArea();
	rectangleCircum();
	SquareArea();
	SquareCircum();
	s1.close();
}

static void CircleArea()
{
	System.out.println("enter the value of radius");
	
	a= s1.nextDouble(); //radius 
	area = Math.PI * a * a;
	System.out.println(area);
}
static void CircleCircum()
{
	System.out.println("enter the value of radius");
	
	a= s1.nextDouble(); //radius 
	circum = 2 * Math.PI * a ;
	System.out.println(circum);
}
static void triangleArea()
{
	
	
	System.out.println("please enter the value of breadth b");
	a = s1.nextDouble();
	System.out.println("please enter the value of height h");
	b = s1.nextDouble();
	 area = 0.5 * a* b;
	System.out.println("Area of triangle is :");
	System.out.println(area);
	
}
static void triangleCircum()
{
	


	System.out.println("please enter the value of a");
	a = s1.nextDouble();
	System.out.println("please enter the value of b");
	b = s1.nextDouble();
	System.out.println("please enter the value of c");
	c = s1.nextDouble();
	 circum = a + b + c;
	System.out.println("circumference of triangle is :");
	System.out.println(circum);
	
}

static void rectangleArea()
{
	


	System.out.println("Please enter the value of side a ");
	a = s1.nextDouble();
	System.out.println("please enter the value of other side b");
	b = s1.nextDouble();
	area = a * b;
	System.out.println("area of rectangle is :");
	System.out.println(area);
	
}

static void rectangleCircum()
{

	System.out.println("Please enter the value of side a ");
	a = s1.nextDouble();
	System.out.println("please enter the value of other side b");
	b = s1.nextDouble();
    circum = 2*(a+b);
	System.out.println("circumference of rectangle is :");
	System.out.println(circum);
	
	
}

static void SquareArea()
{
	
	System.out.println("Please enter the value of side a");
	a = s1.nextDouble();
    area = a * a;
	System.out.println("The area of square is :");
	System.out.println(area);
	
}
static void SquareCircum()
{
	
	
	System.out.println("Please enter the value of side a");
	a = s1.nextDouble();
	circum = 4 * a;
	System.out.println("The circumference of square is :");
	System.out.println(circum);
	
}


}
