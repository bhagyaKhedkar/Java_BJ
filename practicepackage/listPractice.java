package practicepackage;

import java.util.ArrayList;


public class listPractice 
{
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
	    a1.add(10);
	    a1.add(20);
	    a1.add(30);
	    a1.add(40);
	    a1.add(50);
	    
	    a1.add(3,60);
	    System.out.println(a1);
	    
	    System.out.println(a1.get(4));
	    a1.set(3, 100);
	    System.out.println(a1.get(3));
	    a1.remove(2);
	    System.out.println(a1);
	    
	    System.out.println(a1.indexOf(50));
	    
	    //methods of collection interface implemented by arraylist
	    System.out.println(a1.size());
	    
	    System.out.println(a1.contains(50));
	    
	    System.out.println(a1.isEmpty());
	    
	    System.out.println(a1.hashCode());
	    
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    a1.remove(3);
	    System.out.println(a1);
	    
	    System.out.println(a1.equals(a2));
	    
	    for (Integer i  : a1)
	    {
	    	System.out.println(i);
		}
	    
	    
	    
	    
	    
	    
	    a1.clear();
	    
	    System.out.println(a1);
	    
	}
}
