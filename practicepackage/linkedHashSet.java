package practicepackage;
import java.util.*;

public class linkedHashSet 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> pincode =new LinkedHashSet<Integer>();
		Queue<Integer> s = new LinkedList<>();
		pincode.add(585103);
		pincode.add(585104);
		pincode.add(585105);
		pincode.addFirst(560085);
		s= new PriorityQueue<Integer>();
		//Collections.sort(s);
		
		System.out.println(pincode);
		
		System.out.println(pincode.contains(560085));
		
		System.out.println(pincode.isEmpty());
		
		Iterator<Integer> i1 = pincode.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
