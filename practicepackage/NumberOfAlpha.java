package practicepackage;
import java.util.Arrays;
public class NumberOfAlpha 
{
	

	
	        static int countofAlpha=0;
	        static int countofNumeric=0;
	        static int countofSpace=0;
	        public static void main(String[] args) 
	        {
	                String input="special !@# 123";
	                char [] c1=input.toCharArray();
	                System.out.println(Arrays.toString(c1));
	                for(int i=0;i<c1.length;i++)
	                {
	                boolean b1=Character.isAlphabetic(c1[i]);
	                boolean b2=Character.isDigit(c1[i]);
	                boolean b3=Character.isWhitespace(c1[i]);

	                        if(b1)
	                        {
	                                countofAlpha++;
	                        }
	                        if(b2)
	                        {
	                                countofNumeric++;
	                        }
	                        if(b3)
	                        {
	                                countofSpace++;
	                        }
	                }
	                int countofSpecialChar=input.length()-(countofAlpha+countofNumeric+countofSpace);
	                
	                
	                System.out.println("Number of ALphabets in the Given String is -> "+countofAlpha);
	                System.out.println("Number of Numeric in the Given String is -> "+countofNumeric);
	                        System.out.println("Number of spaces in the Given String is -> "+countofSpace);
	                System.out.println("Number of speacial char in the Given String is -> "+countofSpecialChar);
	    
	        }
	}


