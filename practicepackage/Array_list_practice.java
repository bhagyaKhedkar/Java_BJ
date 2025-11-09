package practicepackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Array_list_practice {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>(); // declaration & initialization
		names.add("Bhagya");// adding elements to the arraylist collection
		names.add("Akshay");
		names.addFirst("Adhvik");
		names.addLast("Abhijna");
		System.out.println(names);
		names.add(0, "Akshay");
		names.add(1, "Bhagya");

		System.out.println(names);
		System.out.println(names.get(3));// retrieving
		
		names.set(3,"");//updating an arraylist
		System.out.println(names);
		
		names.remove(3);
		names.remove(3);
		System.out.println(names);//removing items from array list
		
		System.out.println(names.size());//length /number of elements in arraylist
		//names.clear();//removing all the elements from the list ,returns an  empty arraylist
		System.out.println(names);
		
		//iterating and searching
		for(int i =0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		for(String name : names)
		{
			System.out.println(name);
		}
		System.out.println(names.contains("Bhagya"));//to check if the element is present in the arraylist or not
		
		ArrayList<String> morenames = new ArrayList<String>();
		morenames.add("indu");
		morenames.add("lakshmikant");
		System.out.println(morenames);
		names.addAll(morenames);
		System.out.println(names);
		//size of arraylist
		System.out.println(names.size());
		//converting an arraylist to array
		String[] nameArray = names.toArray(new String[0]);
		System.out.println(Arrays.toString(nameArray));
			names.listIterator();
		//iterating 
		ListIterator<String> l1 = names.listIterator();
		while(l1.hasNext())
		{
			String StudentToRemove = l1.next();
			if(StudentToRemove.equals("Abhijna"))
			{
				l1.remove();
				System.out.println(names+"removed");
				
			}
			System.out.println("the next element is:");
			System.out.println(l1.next());
			
			}
		while(l1.hasPrevious())
		{
			System.out.println("the previous element is:");
			System.out.println(l1.previous());
			
		}
		
	}
}