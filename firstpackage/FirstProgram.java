package firstpackage;

public class FirstProgram {

	
	public FirstProgram()
	{
	System.out.println("constructor 1");
	}
	public FirstProgram(int a)
	{
		System.out.println("constructor overloading done");
	}
	public static void method1()
	{
	System.out.println("static method printed");
	}
	public void method2()
	{
		System.out.println("non static method printed");
	}
	
	
	
  public static void main(String[] args) {
	
	  System.out.println("welcome back !!");
	  FirstProgram F1 = new FirstProgram();
	 // FirstProgram F2 = new FirstProgram(1);
	  
	  method1();
	  F1.method2();
	  
}
}
