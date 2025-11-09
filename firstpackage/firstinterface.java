package firstpackage;

public interface firstinterface
{
	 void add();
	 void sub();
		 
}

interface seconfinterface extends firstinterface
{
	void mul();
	void div();
}

class newclass implements firstinterface , seconfinterface
{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
class secondclass extends newclass
{	
	public static void main(String[] args) 
	{
		secondclass sc = new secondclass();
		sc.add();
	}
	
	
}