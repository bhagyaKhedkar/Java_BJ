package practicepackage;

import java.util.Arrays;

public class SortArrayPractice 
{
	public static void main(String[] args) 
	{
		int A[]={10,2,3,4};
		int temp;
		for (int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
		
		{
			if(A[i]>A[j])
			{
				temp = A[j];
				A[j]=A[i];
				A[i]=temp;
			}
			
		}
		}
		System.out.println(Arrays.toString(A));
		
		
	}
}
