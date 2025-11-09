package practicepackage;

public class ArrayEqual {
	public static void main(String[] args) {
		int A[] = { 1, 8, 9 };
		int B[] = { 1, 8, 8 };
		
		boolean ret = true;
		if(A.length==B.length)
		{
			for(int i =0; i<A.length; i++)
			{
				if(A[i]!=B[i])
				{
					ret = false;
				}
				
			}
		}
		else
		{
			ret =false;
		}
		
		if(ret == true)
		{
			System.out.println("two arrays are equal");
		}
		else
		{
			System.out.println("two arrays are not equal");
		}
		
		
		
		
		
		
		
		
		
	}
}
