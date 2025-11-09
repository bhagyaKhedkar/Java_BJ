package firstpackage;

import java.util.Scanner;

public class stringFunctions
{
	String s1;
	String s2="";
	
	public void palindrome()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter a string that you want to check for palindrom");
		s1 = sc1.next();
		for(int i = s1.length()-1; i>=0 ; i--)
		{
			char c2 = s1.charAt(i);
			s2 = s2 + c2 ;
		}
		
		boolean b = s1.equals(s2);
		   if(b)
		{
			System.out.println("its a palindrom");
		}
		else
		{
		System.out.println("its not a palindrom");
		}
		
	}
	public static void main(String[] args) 
	{
		
		stringFunctions sf1 = new stringFunctions();
		
		sf1.palindrome();
				
	}


}