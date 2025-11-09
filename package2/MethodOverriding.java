package package2;
class RBI
{
	void return_calculator()
	{
		System.out.println("RBI   return calculator");
	}
			
}
class HDFC extends RBI
{
	void return_calculator()
	{
		System.out.println("hdfc   return calculator");
	}
}
class SBI extends HDFC
{
	void return_calculator()
	{
		System.out.println("sbi   return calculator");
	}
}
public class MethodOverriding extends SBI
{
	
	void return_calculator()
	{
		System.out.println("child   return calculator");
	}
	
	
	public static void main(String[] args) {
		
	}
}
