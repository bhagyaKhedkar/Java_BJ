package firstpackage;

import java.util.Scanner;

public class StatNonstatGlobalVar 
{
	public static int Days = 7;
	public int month = 12;
	Scanner s1 = new Scanner(System.in);
	public static void main(String[] args)
	{
		Weeksalary();
		monthsalary();
		StatNonstatGlobalVar v1 = new StatNonstatGlobalVar();
		v1.s1.close();
	}
	private static void monthsalary() 
	{
		int sal;
		int perday;
		StatNonstatGlobalVar v1 = new StatNonstatGlobalVar();
		//Scanner s1 = new Scanner(System.in);
		System.out.println("ënter your per day salary");
		perday = v1.s1.nextInt();
		
		sal = v1.month * perday;  
		System.out.println("your monthly salary is :");
		System.out.println(sal);
		//s1.close();
		
	}
	public static void Weeksalary()
	{
		int sal;
		int PerDay;
		StatNonstatGlobalVar v1 = new StatNonstatGlobalVar();
		System.out.println("please enter the salary per day");
		PerDay = v1.s1.nextInt();
		sal = PerDay * Days;
		System.out.println("your weekly salary is :");
		System.out.println(sal);
		
		//s1.close();
	}
	
	
}
