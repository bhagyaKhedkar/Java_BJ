package firstpackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualCheck {
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the length of first array");
		int A[] = new int[s1.nextInt()];
		System.out.println("enter the length of second array");
		int B[] = new int[s1.nextInt()];
		
		for(int i=0 , j=0 ; i<A.length && j<B.length ; i++ , j++)
		{
			System.out.println("enter the value of first array at: "+i);
			A[i]=s1.nextInt();
			
			System.out.println("enter the value of second array at: "+j);
			B[j]=s1.nextInt();
		}
		boolean ret = true;
		   if(A.length == B.length)
		   {
			   for(int i=0 ; i<A.length ;i++)
			   {
				   if(A[i]!=B[i])
				   {
					   ret = false;
				   }
			   }
		   }
		   else
		   {
			   ret = false;
		   }
		   
		   if(ret == true)
		   {
			   System.out.println("the two arrays are equal");
		   }
		   else
		   {
			   System.out.println("two arrays are not equal");
		   }
	}
	
		

}