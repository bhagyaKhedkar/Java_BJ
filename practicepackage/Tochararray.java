package practicepackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tochararray
{
	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int []i1 = new int[s1.nextInt()];
		
		for(int j=0;j<i1.length;j++)
		{
			System.out.println("please enter the value of array at index "+j);
			i1[j]=s1.nextInt();
		}
		System.out.println(Arrays.toString(i1));
		s1.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* Scanner s1=new Scanner(System.in);
         System.out.println("Please eneter the size of your array:-");
         int []rollno=new int[s1.nextInt()]; //datatype arrayname = new datatype[size]
         for(int i=0;i<rollno.length;i++)
         {
                 System.out.println("Please eeter the value of array at index position-> "+i);
                 rollno[i]=s1.nextInt();//here contents of array
         }        
         System.out.println(Arrays.toString(rollno));
         s1.close();

		}
		*/
	
	
	
	
	
	
	
	
	
	
	//System.out.println(Arrays.toString(c1));*/ //to represent the string in the [ ] array form 
	}

}