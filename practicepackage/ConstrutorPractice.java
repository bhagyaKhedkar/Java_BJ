package practicepackage;

import java.lang.reflect.Constructor;

public class ConstrutorPractice
{
	int i = 10;
	public ConstrutorPractice() //non parameterized constructor 
	{
		System.out.println("non parameterized constructor");
	}
	//constructor overloading
	public ConstrutorPractice(long Mobile)
	{
		System.out.println("long parameterized constructor"+Mobile);	
	}
	public ConstrutorPractice(String email) //string is a data type as well as class,hence need to write capital
	//but we dont have to import string class even though we are accessing it outside its package java.lang
	//any class from java.lang like system class , string class need not write import 
	{
		System.out.println("string parameterized constructor"+email);
	}
	
	public static void main(String[] args) {
		ConstrutorPractice cp = new  ConstrutorPractice();
		//new ConstrutorPractice(9845894672L);
		//new ConstrutorPractice("bhagyashree_4441@gmail.com");
		//cp.i
	}
	
}
