package firstpackage;

 class ParentClass
{
	 ParentClass()
	{
		System.out.println("constructor1");
	}
	 ParentClass(int a)
	{
		this();
		System.out.println("constructor2");
	}
}
 public class ThisandSuper extends ParentClass
{
	 ThisandSuper()
	{
		this(10);
		System.out.println("constructor3");
	}
	 ThisandSuper(int x)
	{
		
		super(1);
		System.out.println("constructor4");
	}
	public static void main(String[] args)
	{
	
		 new ThisandSuper();
		
	}
}
