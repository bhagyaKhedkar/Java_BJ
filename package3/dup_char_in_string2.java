package package3;

import java.util.Arrays;

public class dup_char_in_string2 {
	public static void main(String[] args) {
		String s1 = "ababacbc";
		char[] c1=s1.toCharArray();
		int count=0;
		Arrays.sort(c1);
		//System.out.println(c1);
		for(int i=0;i<s1.length()-1;i++)
		{
			if(c1[i]==c1[i+1])
			{
			while(i<s1.length()&&(c1[i]==c1[i+1]))	
			{
			count++;	
			}
			
			System.out.println("duplicate character: "+c1[i]+count+" times");

			}
					}
		
		
	}
}
