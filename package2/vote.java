package package2;

import java.util.Scanner;

public class vote 
{
	static int  age ;
	public static void main(String[] args) {
		System.out.println("please enter your age:");
		Scanner s1=new Scanner(System.in);
		age = s1.nextInt();
		if(age<18)
		{
			System.out.println("you are not elegible to vote");
		}
		else
		{
			System.out.println("you are elegible to vote");
		}
		
	}
}
