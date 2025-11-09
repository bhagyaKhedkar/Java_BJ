package practicepackage;

public class StringFunctionalityPractice {
	public static void main(String[] args) 
	{		
		String s1 = "Software";
		String s2= "";
		s2=s1.concat(" testing");//to add some text to the existing string ,but it creates a new string 
		//as string is immutable
		System.out.println(s2);
		
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s2.trim());
		System.out.println(s1.contains("war"));
		System.out.println(s1.replace('t', 'T'));
		System.out.println(s1.replaceAll("[a-z]", "C"));
		System.out.println(s1.matches("S.*"));
		String s3 = "Automation testing";
		String s4 = "Automation Testing";
		
		System.out.println(s4.equals(s3));
		System.out.println(s4.matches("(.*)T(.*)"));
		System.out.println(s3.matches("(.*)ing"));
		
		
		

	}
}
