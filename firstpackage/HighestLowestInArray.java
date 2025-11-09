package firstpackage;
import java.util.Scanner;
public class HighestLowestInArray 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the length of array");
		int A[] = new int[s1.nextInt()];
		int temp=0;
		System.out.println("enter the values of array");
		for(int k=0;k<A.length;k++)
		{
			A[k]=s1.nextInt();
		}
		//first we are sorting the array in ascending way 
		//then printing the value at index 0 as lowest
		//value at A.length as highest
		for(int i = 0; i < A.length; i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					//logic to swap the numbers 
					//take up the higher number in temp
					//assign the lower value to hifher value place 
					//then assign the higher value to lower value place
					//now you have higher value moved to one place next index and vice versa
				  temp = A[i];
				  A[i]=A[j];
				  A[j]=temp;
				}
				
			}
			
		}
		//now the logic to find lowest n highest is
		//the one at 0th index will be lowest in ascending order 
		//the one at length -1 th position will be highest number 
		
		System.out.print("the lowest value in the array is :");
		System.out.println(A[0]);
		System.out.print("the highest value in the array is :");
		System.out.println(A[A.length-1]);
	}
}
