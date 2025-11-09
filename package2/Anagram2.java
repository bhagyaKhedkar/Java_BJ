package package2;

import java.util.Arrays;

public class Anagram2 
{
	public static void main(String[] args)
	{
		String s1 = "rome";
		String s2 = "more";
		char [] a1 = s1.toCharArray();
		char [] a2 = s2.toCharArray();
		boolean ret =true ;
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(a1.length == a2.length)
		{
			for(int i =0; i<a1.length-1;i++)
			{
				if(a1[i]!=a2[i])
						{
							ret= false;//content not same 
						}
			}
		}
		else//if length not same
		{
			ret = false;
		}
		if(ret == true)//if length same and content also same
		{
			System.out.println("anagram");
		}
		else 
		{
			System.out.println("not anagram");
		}
		
	}
}

/* 
algorithm for anagram

first take two string you want to check them anagram or not 
store them as array of character using toCharArray
then sort them using Arrays.sprt(arrayname)
then check wether both arrays length is sanme because if length is not same then they are obviously not anagram
if not same length , then return false and not anagram
if same the check the contents --> using array[i] in for loop , then if contentc 
not same then return false ,else true , this will print anagram or not 

*/