package package2;

public class LogicalOp {
	public static void main(String[] args) {
		int a = 10;
		int b=5;
		if(a>5 && b>2 || a==10 && b==5)
		{
			System.out.println("condition passed");
		}
		else
		{
			System.out.println("condition failed");
		}
	}

}
