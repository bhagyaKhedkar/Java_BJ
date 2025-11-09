
package package2;

public class Static_method {
	
	static void add()
	{
		int a =10;
		int b=20;
		int c =a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a =10;
		int b=20;
		int c ;
		c=a-b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		add();
		Static_method sm = new Static_method();
		sm.sub();
		
	}

}
