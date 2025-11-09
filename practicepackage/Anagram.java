package practicepackage;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String s1 = "EARTH";
		String s2 = "HEART";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		boolean ret =true;
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(c1.length == c2.length)
		{
		for(int i =0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				ret = false;
				break;
			}
			
		}
		}
		else
		{
			ret = false;
		}
		if(ret==true)
		{
			System.out.println("two strings are anagram");
		}
		else
		{
			System.out.println("two strings are not anagram");
		}

	}

}
