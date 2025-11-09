package package2;

public class Search_aray
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int key = 2;
		boolean ret=false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==key)
			{
				System.out.println("the element is found succesfully at "+i);
				ret = true;
				
				
			}
			
		}
		if(ret==false)
		{
			
				System.out.println("the element not found ");
			
		}
	}
}
