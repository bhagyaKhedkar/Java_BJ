package practicepackage;
import java.util.ArrayList;
import java.util.List;
public class arraylist 
{
	public static void main(String[] args) {
	
	
	List<String> l1 = new ArrayList<String>();
	l1.add("bhagya");
	l1.add("akshay");
	l1.add("adhvik");
	l1.add("abhijna");
	System.out.println(l1);
	l1.set(0, "Bhagya");
	System.out.println(l1);
	l1.remove(0);
	System.out.println(l1);
	System.out.println(l1.get(1));
	System.out.println(l1.isEmpty());
	System.out.println(l1.contains("adhvik"));
	List<String> l2 = new ArrayList<String>();
	l2.add("akshay");
	l2.add("adhvik");
	l2.add("abhijna");
    l1.retainAll(l2);
    System.out.println(l1);
	
	
	
	
	}
}
