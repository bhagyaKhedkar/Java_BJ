package practicepackage;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector_practice 
{
	public static void main(String[] args) {
		
		Vector<String> students = new Vector<String>();
		//adding the elements to the vector
		students.add("shruti");
		students.add("shruti");
		students.add("Bhagya");
		students.addElement("Chaitra");
		
		
		students.add(3, "Swathi");
		System.out.println(students);
		System.out.println(students.capacity());
		System.out.println(students.size());
		
	
		//Retrieving the elements
		System.out.println(students.elementAt(2));
		System.out.println(students.get(2));//get and elementAt are same 
		
		//Updating the vector
		students.setElementAt(null, 2);
		System.out.println(students);
		students.set(3, null);
		System.out.println(students);
		String arr[]=new String[10];
		//modifying the vector
		students.copyInto(arr);
		System.out.println(Arrays.toString(arr));
		//3 ways to iterate a vector
		Iterator<String> i1 = students.iterator();
		Enumeration<String> e1 = students.elements();
		ListIterator<String> l1= students.listIterator();
		
		System.out.println("iterating using enumeration");
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		students.remove(0);
		System.out.println(students);
	}
}
