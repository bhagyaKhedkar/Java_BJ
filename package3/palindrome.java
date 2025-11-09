package package3;

public class palindrome 
{
	//mom,dad,madam
	public static void main(String[] args)
	{
	 String s1 = "bhagya";
	 String s2="";
	//to remove white spaces from a string
	 String s3="  testing  ";
	 System.out.println(s3.trim());
	 //reverse the given string
	 for(int i=s1.length()-1;i>=0;i--)
	 {
		 char c1 = s1.charAt(i);
		 s2=s2+c1;
	 }
	// System.out.println(s2);
	 //to check palindrom
	 if(s1.equals(s2))
	 {
		 System.out.println("Entered string is a palindrome");
	 }
	 else
	 {
		 System.out.println("Entered string is not a palindrome");
	 }
	}
	
	
	
}

