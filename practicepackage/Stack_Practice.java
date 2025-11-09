package practicepackage;


import java.util.Enumeration;
import java.util.Stack;

public class Stack_Practice
{
	public static void main(String[] args)
	{
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Horse");
		animals.push("Rabbit");
		
		System.out.println(animals);
		System.out.println(	animals.peek());
		
		System.out.println(animals);
		
		System.out.println(animals.pop());
		System.out.println(animals);
	
		Enumeration<String> e1 = animals.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}
