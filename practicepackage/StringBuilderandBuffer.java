package practicepackage;
//practicing the methods of string builder and string buffer
public class StringBuilderandBuffer 
{
	public static void main(String[] args) {
		
	
	StringBuffer s1 = new StringBuffer("Automation");
	s1.append("TESTING");
	System.out.println(s1); //since string buffer is mutable ,we can add new string to existing string
	s1.insert(10, ' ');
	System.out.println(s1);
	s1.replace(0, 10, "MANUAL");
	System.out.println(s1);
	s1.delete(0, 6);
	System.out.println(s1);
	
	}
	
}
