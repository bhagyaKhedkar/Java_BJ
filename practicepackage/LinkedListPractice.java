package practicepackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice
{
	public static void main(String[] args) {
		LinkedList<String> employees = new LinkedList<String>();
		employees.add("Neel");
		employees.add("medha");
		employees.add("anu");
		employees.add("rudra");
		
		employees.get(0);
		employees.get(2);
		employees.set(0, "Bhagya");
		System.out.println(employees);
		
		employees.remove("rudra");
		System.out.println(employees);
		
		System.out.println(employees.size());
		
		ListIterator<String> l1 = employees.listIterator();
		//backward iteration using list iterator
		ListIterator<String> l2 = employees.listIterator(employees.size());//important
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
	
		employees.add(2, null);
		employees.addLast(null);
		System.out.println(employees);
	
	
	
	}
}
