package Assignment7;

//import Assignment7.bank.customer;

class bank 
{
	private int bno;
	private String bankname;
	private String loc;
	
	//public bank(int bno, String bankname, String loc)
	//{
	//	this.bno= bno;
	//	this.bankname= bankname;
	//	this.loc=loc;
	
	//}
	
	public int getbankno()
	{
		return bno;
		
	}
	public void setbankno(int bno)
	{
		this.bno= bno;
	}
	public String getbankName()
	{
		return bankname;
	}
	public void setbankName(String bankname)
	{
		this.bankname=bankname;
		
	}
	public String getloc()
	{
		return loc;
	}
	public void setloc(String loc)
	{
		this.loc= loc;
	}
	
	
	
	
	
}
class customer
{
	private int custid;
	private String cname;
	private int Acno;
	private double amt;
	
	public customer(int custId, String cname, int accno, double amt) {
		this.amt = amt;
		this.custid = custId;
		this.cname = cname;
		this.Acno = accno;
	}
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getAcno() {
		return Acno;
	}
	public void setAcno(int acno) {
		Acno = acno;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double d) {
		this.amt = d;
	}
	
	
}


public class Assignment7 {
	
 public static void main(String[] args) {
	 bank b = new bank();
		customer[] obj = new customer[10];
		obj[0] = new customer(1, "Nikita", 54, 543.43);
		obj[1] = new customer(2, "priya", 54, 543.43);
		obj[2] = new customer(3, "sanchit", 54, 543.43);
		obj[3] = new customer(4, "rakshit", 54, 543.43);
		obj[4] = new customer(5, "sanchit", 54, 543.43);
		obj[5] = new customer(6, "sanchit", 54, 543.43);
		obj[6] = new customer(7, "sanchit", 54, 543.43);
		obj[7] = new customer(8, "sanchit", 54, 543.43);
		obj[8] = new customer(9, "sanchit", 54, 543.43);
		obj[9] = new customer(10, "sanchit", 54, 543.43);
		

	
		
        // Display customer data
        for (customer customer : obj) {
            System.out.println("Customer ID: " + customer.getCustid());
            System.out.println("Customer Name: " + customer.getCname());
            System.out.println("Account Number: " + customer.getAcno());
            System.out.println("Amount: " + customer.getAmt());
            System.out.println();
        }
		
		
	}

}
