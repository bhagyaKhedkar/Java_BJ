package practicepackage;
class ParentClass
{
	public ParentClass()
	{
		System.out.println("non para construc of parent class");
	}
	public ParentClass(int i)
	{
		this(); //this() calling statement is used to call one constructor
		//from another constructor within a same class
		//we can not have combination of super() and this()
		System.out.println(" para construc of parent class");
	}
}
public class SuperCallingstatement extends ParentClass
{
   SuperCallingstatement()
   {
	   super(100);//if there was no parameterized constructor then if we did not write super() also the non para constructor
	   //will get executed but if there
	   //is a para constructor then we have to explicitely call the para constructore using super(parameter) and default
	   //will not b invoked ,we can make use of this() in parent class
	   // we can not inherit constructor of parent class in child class 
	   //hence in order to call the parent class constructor we use super calling statement in child constructor 
	   //to call the parent consrtuctor 
	   //super(100);
	   //constructor overriding is not possible since we can not inherit constructor 
	   //but v can use parameterized super() calling ststement to inialize parent parameterized constructor 
	   //you can not have 2 super calling statements in one constructor so we use this() in the parent class constructor to
	   //call one more constructor of parent class
	   
   }
   public static void main(String[] args) {
	new SuperCallingstatement();
}
}
