package firstpackage;

import java.util.Scanner;

public class Vote
{
	public static void main(String[] args)
	{
		int age ;
		System.out.println("Enter your age");
		Scanner s1 = new Scanner(System.in);
		age = s1.nextInt();
		if(age >= 18)
		{
			System.out.println("You are elegible to vote");
	
		}

		else 
		{
			System.out.println("you are not elegible to vote");
		}
		s1.close();
	}
}
