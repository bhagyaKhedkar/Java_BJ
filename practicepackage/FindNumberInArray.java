package practicepackage;

public class FindNumberInArray
{
	public static void main(String[] args) 
	{
		int A[]= {10,20,30,10};
		int key = 10;
		int count=0;
		for(int i =0;i<A.length;i++)
		{
			if(A[i]==key)
			{
				System.out.println("the element to find is present at index :-> "+i);
				count++;
				
			}
			
		}
	
		System.out.println("its present for "+count+"times");
	}
}
