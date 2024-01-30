package Interface;

  interface Transaction
  {
	  public void TransId();
	  public void amount();
  }
  
interface customer extends Transaction
{
	public void Type();
	
	public void cusname();
	
}

class Bank implements Transaction,customer
{
	public void Type()
	{
		System.out.println("Type is deposit");
	}
	

	@Override
	public void amount() 
	{
		System.out.println("amount is 2500");
		
	}
	public void cusname()
	{
		System.out.println("name is shyam");
	}


	@Override
	public void TransId() {
		System.out.println("transaction id is 2743");
		
	}
}

public class InterfaceAssignment {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.amount();
		obj.cusname();
		obj.TransId();
		obj.Type();
	}

}
