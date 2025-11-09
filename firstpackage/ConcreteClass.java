package firstpackage;

abstract class PaymentGateway
{
	abstract void payment();
	abstract void ComparePrize();
}
abstract class BookTickets extends PaymentGateway
{
	abstract void TicketAvailability();
	abstract void PreferedSeat();
	static void dateOfJourney() 
	{
		System.out.println("customer selects date of journey here,which is same for all 3rd parties ");
	}
}

public class ConcreteClass extends BookTickets
{
	void payment()
	{
		System.out.println("Pay via BHIM UPI");
	}
	void ComparePrize()
	{
		System.out.println("Price is lower on XYZ site");
	}
	void TicketAvailability()
	{
		System.out.println("Two seats are available");
	}
	void PreferedSeat()
	{
		System.out.println("Window seat");
	}
	public static void main(String[] args) 
	{
		ConcreteClass c1 =  new ConcreteClass();
		c1.payment();
		c1.ComparePrize();
		c1.TicketAvailability();
		BookTickets.dateOfJourney();
		c1.PreferedSeat();
	}
}
