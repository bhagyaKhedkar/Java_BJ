package firstpackage;

import java.util.Scanner;

public class assertKey
{
	public static void main(String[] args) 
	{
	
		String gender ="M" ;
		System.out.println("please enter M for male and F for female");
		Scanner s1 = new Scanner(System.in);
		gender = s1.next();
		assert gender == "M" : "Only females are elegible for this fees concession ";
		
		if(gender== "F")
		{
		 	System.out.println("You are elegible to get the fees concession");
		}
		else
		{
			System.out.println("You are not elegible to get the fees concession");
		}
		s1.close();
	}	
	
}
