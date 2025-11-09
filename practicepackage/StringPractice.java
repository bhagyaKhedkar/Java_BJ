package practicepackage;

import java.util.Arrays;

public class StringPractice
{
	public static void main(String[] args) 
	{
		String s1 = "Software";
		String s2 = new String("Software");
		String s4 = s1;
		String s5 ="Software";
		String s3 =s1.concat(s2);//1
		System.out.println(s3);
		System.out.println(s1.contains("ware"));//2
		System.out.println(s1.charAt(4));//3
		/* When two strings are created using literals i.e, hard coded values using string s1="hello"
		 * and string s2="hello", they both point to same memory location by the concept of sting interning
		 * means string pooling,to optimize the memory usage ,in which they point to same memory location if content is same
		 * this is same case when one string is assigned to another string like string s3=s1; in this case
		 * the string s3 will also point at value of s1,it will not create new memory for it,hence when we use
		 * s1==s2 and s1==s3 , it returns true as the content and memory location are both same 
		 * where as if we create one string with literal i.e., string s1="hello"; and string s2=new string("hello")
		 * in this case a new memory is allocated to s2 ,so even though the contents are same the memory location will b different so s1==s2 return false,
		 * to check the contents we should use s1.equals(s2)in this case  */
		System.out.println(s1.equals(s2));//4
		System.out.println(s1==s2);//5
		System.out.println(s1==s5);
		System.out.println(s1==s4);
		System.out.println(s1.length());//5
		System.out.println(s1.matches("^S......e$"));//6-regex
		System.out.println(s1.contains("ware"));//7
		System.out.println(s1.isBlank());//8 checks if string is empty or has only whitespaces
		System.out.println(s1.isEmpty());//9checks if length is 0
		System.out.println(s1.replace('S', 'H'));//8
		System.out.println(s1);
		System.out.println(s1.replace("Software", "Hardware"));//8
		System.out.println(s1);
		System.out.println(s1.replaceAll("[o,a,e]", "v"));
		//System.out.println(s1.replaceFirst(s5, s3)	);
		System.out.println(s1.indexOf('S'));//9
		System.out.println(s1.compareTo(s5));//10
		String s6 ="https://www.amazon.in/b/ref=vpr_b2c_qc_reg/?_encoding=UTF8&ie=UTF8&node=/-6be3-4c95-b8cc-3/bfbfc7d47a2&";
		System.out.println(s6.split("/"));//returns array of strings
		/*[Ljava.lang.String;@85ede7b is the default string representation of an array of strings in Java
		 * when you try to print it directly. 
		 * It does not show the contents of the array but rather its type and memory address. 
		  in order to contents v should use ToString() method*/
		System.out.println(Arrays.toString(s6.split("/")));//11
		System.out.println(s1.substring(4));
		String s7 = "  testing  trim  ";
		System.out.println(s7.trim());//12
		char[] array ={'a','b','h'};
		String s8=String.copyValueOf(array);//13
		System.out.println(s8);
		System.out.println(s8.substring(1, 2));//14
		System.out.println(s1.subSequence(0, 3));//15
		System.out.println(s1.toLowerCase());//16
		System.out.println(s1.toUpperCase());//17
		char[] c = s1.toCharArray();//18
		System.out.println(c);
		System.out.println(Arrays.toString(c));//19
		System.out.println(String.valueOf(array));//20 
		
		
				
	}
	
}
