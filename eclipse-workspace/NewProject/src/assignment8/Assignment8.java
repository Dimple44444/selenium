package assignment8;

class bank 
{
	private int bno;
	private String bankname;
	private String loc;
	
	
	
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
class transactiion
{
	private int trans_id;
	private String trans_desc;
	
	
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public String getTrans_desc() {
		return trans_desc;
	}
	public void setTrans_desc(String trans_desc) {
		this.trans_desc = trans_desc;
	}
	
}

public class Assignment8 {

	public static void main(String[] args) {
		 bank[] banks= new bank[10];
		 customer[] customers= new customer[10];
		 transactiion[] transactions= new transactiion[10];
		 
		 
		 for (int i = 0; i < 10; i++) {
	            banks[i] = new bank();
	            banks[i].setbankno(1000 + i);
	            banks[i].setbankName("Bank " + (i + 1));
	            banks[i].setloc("Location " + (i + 1));
	            
	            customers[i] = new customer();
	            customers[i].setCustid(2000 + i);
	            customers[i].setCname("Customer " + (i + 1));
	            customers[i].setAcno(3000 + i);
	            customers[i].setAmt(250 * (i + 1));

	            transactions[i] = new transactiion();
	            transactions[i].setTrans_id(4000 + i);
	            transactions[i].setTrans_desc("Transaction " + (i + 1));
		 
	}
		 System.out.println("Bank Records:");
	        for (bank bank : banks) {
	            System.out.println("Bank Number: " + bank.getbankno());
	            System.out.println("Bank Name: " + bank.getbankName());
	            System.out.println("Location: " + bank.getloc());
	            System.out.println();
	        }
	        System.out.println("Customer Records are:");
	        for (customer customer : customers) {
	            System.out.println("Customer ID: " + customer.getCustid());
	            System.out.println("Customer Name: " + customer.getCname());
	            System.out.println("Account Number: " + customer.getAcno());
	            System.out.println("Amount: " + customer.getAmt());
	            System.out.println();
	        }
	        
	        System.out.println("Transaction Records are:");
	        for (transactiion transaction : transactions) {
	            System.out.println("Transaction ID: " + transaction.getTrans_desc());
	            System.out.println("Transaction Description: " + transaction.getTrans_desc());
	            System.out.println();
	        }


}
}
