package package3;

import java.util.Arrays;

public class Str_rev {
	public static void main(String[] args) {

		String s1 = "pool";
		String rev = "";

		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1 = s1.charAt(i);
			rev=rev+c1;
			
		}
		System.out.println(rev);
	}
}