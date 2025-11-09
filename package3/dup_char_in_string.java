package package3;

import java.util.Arrays;

public class dup_char_in_string {
	public static void main(String[] args) {
		String s1 = "aabbcc";
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
		//int count = 0;
		//boolean dup = false;
		for (int i = 0; i < s1.length() - 1; i++) {
			if (c1[i] == c1[i + 1]) {
			
				//count++;
				System.out.println("duplicate character is: " + c1[i]);
			} else {
				continue;

			}
			while (i < s1.length() - 1 && c1[i] == c1[i + 1]) {
				i++;

			}
		}
		
			//System.out.println("duplicate characters in given string are: "+ );
		
	}
}