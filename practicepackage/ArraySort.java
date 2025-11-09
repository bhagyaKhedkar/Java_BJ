package practicepackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the length of array");
		int A[] = new int[s1.nextInt()];
		
		for(int i = 0; i < A.length ; i++)
		{
			System.out.println("enter the value of array:");
			A[i]=s1.nextInt();
		}
		//to accept the array elements at runtime-above logic
		//Ascending order
		int x =0;
		for(int j=0 ; j<A.length ; j++)
		{
			for(int k=j+1 ; k<A.length ;k++)
			{
				if(A[j]>A[k])
				{
					x=A[j];
					A[j]=A[k];
					A[k]=x;
				}
				
			}
			
		}
		System.out.println("Arrays in Ascending order:");
		System.out.println(Arrays.toString(A));
		
		for(int i = 0; i < A.length ;i++)
		{
			for(int j=i+1 ; j<A.length;j++)
			{
				if(A[i]<A[j])
				{
					x=A[i];
					A[i]=A[j];
					A[j]=x;
				}
			}
		}
		System.out.println("Arrays in descending order:");
		System.out.println(Arrays.toString(A));
		
	}
}
