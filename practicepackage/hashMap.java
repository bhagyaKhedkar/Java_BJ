package practicepackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "ary");
		student.put(2, "pary");
		student.put(2, "kory");
		student.put(2, "lori");
		student.put(3, "beri");
		student.put(4, "noori");
		System.out.println(student);
		System.out.println(student.containsValue("noori"));
		System.out.println(student.get(2));
		System.out.println(student.replace(3, "chori"));
		System.out.println(student);
		//for (Map.Entry<String, Integer> entry : map.entrySet())
		for(Map.Entry<Integer, String> entry: student.entrySet())
		{
		System.out.println(entry.getKey()+" "+entry.getValue());	
		}
	}
}
