package firstpackage;

public class NestedIfElse
{

	public static void main(String[] args)
	{
	  double age = 4 ;
	  if(age>3.4 && age < 5.11)
	  {
		  System.out.println("you are elegible for preschool admission...");
		  
		  if(age >= 3.5 && age <4.5)
		  {
			  System.out.println("you are admitted into nursery class");
		  }
		  
		  if(age >=4.5  && age < 5.5)
		  {
			  System.out.println("you are admitted into LKG class");
		  }
		  if(age >=5.5  && age < 6)
		  {
			  System.out.println("you are admitted into UKG class");
		  }
		  
	  }
	  else
	  {
		  System.out.println("you are not elegible for preschool");
		  
	  }
	}
}
