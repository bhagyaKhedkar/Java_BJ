package firstpackage;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
public class stringPractice
{
	
	
	public static void main(String[] args)
	{
		String s1 = "Name";
		String s2= s1.concat("and age");
		//here you are not updating the existing string s1.
		//you are creating a new string whose value will be 'Name and age' which means 
		//s2 value --> s1's value + new value within concat => 'Name' + 'and age '
		//this is because String class is immutable ,hence new object created original remains same
		
		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder("adress");//creating a string builder object
	
		sb.append(" and phone");//updating its value
		System.out.println(sb);//printing updated value
		//since string builder is mutable ,we can update the existing value just by appending 
		
		
		StringBuffer sf = new StringBuffer("city");
		sf.append(" and state"); //updating not creating new string object
	    System.out.println(sf);
	}
	
}
