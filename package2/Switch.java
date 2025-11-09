package package2;

import java.util.Scanner;

public class Switch {
	static String day ;
public static void main(String[] args) {
	
	System.out.println("please enter first two characters of the day you wannt to visit in capital:");
	Scanner s1=new Scanner(System.in);
	day = s1.next();
	switch(day)
	{
	case "MO" : System.out.println("today is monday");
				break;
	case "TU" : System.out.println("today is tuesday");
				break;
	case "WE" :System.out.println("today is wednesday");
				break;
				
	default : System.out.println("invalid day");
	
	}	


}
}
