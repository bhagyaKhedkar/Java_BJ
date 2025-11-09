package firstpackage;

 class SuperMostclass
{
	public static void Login()
	{
		System.out.println("Welcome to home page");
	}
}
class superclass extends SuperMostclass
{
	 public static void ApplyLoan()
	 {
		 System.out.println("Loan application successful");
	 }
}
public class subClass extends superclass
{
 public static void main(String[] args)
 {
	Login();
	ApplyLoan();
 }
}
