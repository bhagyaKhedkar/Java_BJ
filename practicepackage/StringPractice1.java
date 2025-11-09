package practicepackage;

import java.util.Arrays;

public class StringPractice1
{
	public static void main(String[] args) 
	{
		String s1 = "help";
		String s2 = " Hello world ";
		String s3 = new String("Hello");
		String s4 = s3;
		String s5 = new String("hello");
		
		//manipulation  
		System.out.println(s1.concat(s2));
        System.out.println(s1.replace("Hello", "hello"));
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.trim());
        String s8[]= s2.split(" ");
        System.out.println(Arrays.toString(s8));
		//comparison
		
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3.equalsIgnoreCase(s1));
        System.out.println(s3.compareTo(s5)+"compareto function output");
        System.out.println(s3.compareToIgnoreCase(s5)+"compareto function output");
        
		//conversion
        System.out.println(s3.toCharArray());
        byte[]b = s3.getBytes();
        System.out.println(b);
        Boolean a = true;
        System.out.println(s3.valueOf(a));
        String s9;
		System.out.println( s9 = "1".repeat(15));
		//information retrieval
		System.out.println(s3.length());
		System.out.println(s3.charAt(3));
		System.out.println(s3.indexOf('h'));
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		System.out.println(s3.contains("llo"));
		System.out.println(10+10+10+"abs");
		System.out.println("adf"+10+10+10);
		 String str = "    ";
         
	        System.out.println(str.isBlank());
	         
	        System.out.println(str.isEmpty());
	}
}
