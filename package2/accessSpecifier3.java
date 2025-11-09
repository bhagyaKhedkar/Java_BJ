package package2;

import firstpackage.accessSpecifier1;

public class accessSpecifier3 extends accessSpecifier1
{
	public static void main(String[] args) 
	{
		accessSpecifier3 a1 =new accessSpecifier3(); 
		a1.add();
		a1.div();
		
	}
}
        //note : create child class object in order to access protected method,
        //it implies the relationship between both classes 
		//if you create parent class object you are not 
		//making it clear that two classes are related to each other 
		//but when you create child class object and try to access protected member then you are indicating the relation they
		//they hold so you can access
