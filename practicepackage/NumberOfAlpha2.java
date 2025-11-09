package practicepackage;
import java.util.Arrays;
import java.util.Scanner;
public class NumberOfAlpha2 
{
	public static void main(String[] args) 
	{
		int CountNum =0;
		int CountChar=0;
		int CountSpace=0;
		int CountSpecial=0;
		String input;
		//Scanner s1 = new Scanner(System.in);
		//System.out.println("enter a string to count alphabets,numerics,special characters and white spaces :");
		input = "bhagyashree4441@  gmail.com";
		
		char[] c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			
			if(b1)
			{
				CountChar++;
			}
			if(b2)
			{
				CountNum++;
			}
			if(b3)
			{
				CountSpace++;
				
			}
			
			
		}
		CountSpecial=c1.length-(CountNum+CountChar+CountSpace);
		
		System.out.println("number of alphabets"+CountChar);
		System.out.println("number of numericals"+CountNum);
		System.out.println("number of white spaces"+CountSpace);
		System.out.println("number of special characters"+CountSpecial);

	}

}