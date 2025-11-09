package firstpackage;

import java.util.Scanner;

 

public class AnnualSalary 
{
	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
	    double Msalary ;
	    System.out.println("enter your monthly salary");
	    Msalary = s1.nextDouble();
	    double Asalary ;
	    Asalary = 12 * Msalary ;
	    System.out.println("Annual salary is :");
	    System.out.println(Asalary);
	    s1.close();
	}
}
