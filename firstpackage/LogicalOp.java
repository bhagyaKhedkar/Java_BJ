package firstpackage;

import java.util.Scanner;

public class LogicalOp
{
	static boolean tickt = true ;
	static boolean cornerSeat = false;
	static int ReqSeats;
	static int TotalSeats = 100;
	static Scanner input = new Scanner(System.in);
	static void MovieTicket()
	{
		System.out.println("please enter the number of seats");
		ReqSeats = input.nextInt();
		if( ReqSeats == 2  )
		{
			System.out.println("Do ypu want corner seats? : true / false");
			cornerSeat = input.nextBoolean();
		if(cornerSeat && TotalSeats>=2)
		{
			System.out.println("your ticket is booked");
		}
		else if(cornerSeat && TotalSeats<2 )
		{
			System.out.println("Sorry can not book 2 corner seats!");
		}
		
		}
		 System.out.println("do you wish to continue booking tickets?");
		 tickt =input.nextBoolean();
		 if(tickt)
		 {
	   if(!cornerSeat && TotalSeats<=100)
		{
			System.out.println("no corner seat available!!");
			 
		}
		 }
	   System.out.println("do you wish to continue booking tickets?");
		 tickt =input.nextBoolean();
		 
	  
	  
		
		 if (cornerSeat || !cornerSeat && TotalSeats <= 100)
		{
			System.out.println("your"+ ReqSeats+" ticket is booked");
		}
		
		}
	
	public static void main(String[] args)
	{
		MovieTicket();
	}
}
