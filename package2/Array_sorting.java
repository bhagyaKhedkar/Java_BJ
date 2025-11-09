package package2;

import java.util.Arrays;

public class Array_sorting 
{
public static void main(String[] args)
{
	int [] i1 = {5,2,1,4,3};
	int x ;
	for(int i =0 ; i<i1.length;i++) //for i1[0]
	{
		for(int j=i+1;j<i1.length ;j++) //for i1[1] ==i1[0+1]==> i1[1]
		{
			if(i1[i]>i1[j])
			{
				x=i1[i];
				i1[i]=i1[j];
				i1[j]=x;
			}
			
		}
	}
	
	System.out.println(Arrays.toString(i1));
	System.out.println("largest in the array is:"+i1[i1.length-1]);
	System.out.println("smallest in the array is:"+i1[0]);
	
}
}
