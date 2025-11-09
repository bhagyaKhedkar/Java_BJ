package firstpackage;

import java.util.Scanner;

public class ArrayAverage
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the length of array");
		int A1[]= new int[s1.nextInt()];
		
		int sum = 0;
		System.out.println("enter the value of array to calculate the average");
		
		for(int i =0 ; i < A1.length ; i++)
		{
			A1[i] = s1.nextInt();
			 sum =sum + A1[i];
		}
		
		double avg = sum / A1.length;
		System.out.println("average of all the values you have entered is :");
		System.out.println(avg);
		
		
	}
}
