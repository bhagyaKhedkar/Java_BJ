package practicepackage;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the length of both array");
		int []A = new int[s1.nextInt()];
		int []B =  new int[A.length];
		for(int j=0 ; j<A.length; j++)
		{
			System.out.println("enter the value of first array at index position"+j);
			B[j]= s1.nextInt();
			
			A[j]=B[j];
		}	
			System.out.print("Values of array A :");
			System.out.println(Arrays.toString(A));
			System.out.print("Values of array B :");
			System.out.println(Arrays.toString(B));
			s1.close();
	}
	
}
