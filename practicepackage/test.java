package practicepackage;

import java.util.Scanner;

public class test {
	
	public static void main(String[] arr)
	{
	String s = " ";
	int age = 0;
	Scanner s1 = new Scanner(System.in);
	System.out.println("please enter your gender, male/female/others:");
	s=s1.next();
	System.out.println("please enter your age:");
	age = s1.nextInt();
	if(s.equals("female") &&  age>18) //here equals is very important 
	{
	System.out.println("you are eligible to vote");
	}
	else
	{
	System.out.println("you are not eligible to vote");
	}
	}
	}


