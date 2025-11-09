package firstpackage;

import java.util.Scanner;

public class PTR 
{
	public static void main(String[] args) 
	{
		int P ;
		int T;
		int R;
		
      Scanner s1 = new Scanner(System.in);
	  System.out.println("Enter the principal amount recieved ");
	  P = s1.nextInt();
	  System.out.println("Enter the time duration for which amount recieved ");
	  T = s1.nextInt();
	  System.out.println("Enter the rate of interest");
	  R = s1.nextInt();
	  
	  int Total = (P * T * R)/100;
	  System.out.println("Total amount paid by the customer is:");
	  System.out.println(Total + P);
	  s1.close();
	  
	  
	
	
	
	}
}
