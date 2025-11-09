package firstpackage;

import java.util.Scanner;
class methodOveriding 
{
	public void ReturnCalculator()
	{
		System.out.println("This is basic return calculator, you need to select a particular MF toget real value");
		
	}
	
}

class ICICIprudential extends methodOveriding
{
	public void ReturnCalculator()
	{
		System.out.println("ICICIprudential mutual fund returns 34%");
	}
}
class NipponIndia extends methodOveriding
{
	public void ReturnCalculator()
	{
		System.out.println("NipponIndia mutual fund returns 32%");
	}
	
}
class HDFCMidcap extends methodOveriding
{
	public void ReturnCalculator()
	{
		System.out.println("HDFCMidcap mutual fund returns 36%");
	}
}
class DSPMF extends methodOveriding
{
	public void ReturnCalculator()
	{
		System.out.println("DSPMF mutual fund returns 33%");
	}
}

public class customerChoice
{
	public static void main(String[] args)
	{	
		Scanner s1 = new Scanner(System.in);
		System.out.println("please select 1.ICICIprudential 2.NipponIndia 3.HDFCMidcap 4.DSPMF  the mutual fund to calculate returns");
		
		
		int MF = s1.nextInt();
		if( MF == 1)
		{
			ICICIprudential I1 = new ICICIprudential();
			 
			I1.ReturnCalculator();
		}
		if( MF == 2)
		{
			NipponIndia N1 = new NipponIndia();
			N1.ReturnCalculator();
			
		}
		if( MF == 3)
		{
			HDFCMidcap H1 = new HDFCMidcap();
			H1.ReturnCalculator();
		}
		if( MF == 4)
		{
			DSPMF D1 = new DSPMF();
			D1.ReturnCalculator();
		}
		s1.close();
	}
}