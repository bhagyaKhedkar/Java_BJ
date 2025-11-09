package package2;

import firstpackage.accessSpecifier1;

public class accessSpecifier4 
{
	
	public static void main(String[] args)
	{
		
		accessSpecifier1 a1 = new accessSpecifier1();
		//we are not creating any relation between two classes 
		//hence create object of other class to access the members of that class
		a1.add();
	}
}
