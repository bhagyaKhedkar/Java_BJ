package practicepackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class dog implements Animals
{
	public void makeSound()
	{
		System.out.println("bow bow");
	}
}

class cat implements Animals
{
	public void makeSound()
	{
		System.out.println("meow meow");
	}
}

interface Animals
{
	public void makeSound();
}


public class UpcastingPractice {

	public static void main(String[] args) {
		
		dog mydog = new dog();
		cat mycat = new cat();
		//upcasting -- arraylist to collection interface, by which we can access the properties of only collection
		Collection<Animals> myAnimal = new ArrayList<Animals>(); 
		myAnimal.add(mydog);
		myAnimal.add(mycat);
		Iterator<Animals> i1 = myAnimal.iterator(); 
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	
	
	
	
	
	
	
	}
}
