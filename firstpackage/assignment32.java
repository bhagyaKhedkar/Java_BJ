package firstpackage;

 interface I1
 {
	void add();
	
 }
 interface I2 extends I1
 {
 	void sub();
 }
 
 abstract class A1 implements I2
 {
	 abstract void mul();
 }
 abstract class A2 extends A1
 { 	
	 abstract void div();
 }
public class assignment32 extends A2
{
	public void div()
	{
		System.out.println("abstract class 2 method impleted");
	}
	public void mul()
	{
		System.out.println("abstract class 1 method impleted");	
	}
	public void sub()
	{
		System.out.println("interface 2 method impleted");
	}
	public void add()
	{
		System.out.println("interface 1 method impleted");	
	}
  public static void main(String[] args) 
  {
	assignment32 a1 = new assignment32();
	a1.add();
	a1.sub();
	a1.mul();
	a1.div();
	
  }
}
