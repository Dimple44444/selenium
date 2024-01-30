package Abstract;

abstract class Bank {
    public int bno;
    public String bname;
    public String loc;
    
    abstract public void setVal(int b, String name, String l);
    abstract public void showres();
}
    
    
     class Customer extends Bank {
       
        
        public void setVal(int b, String name, String l) {
            this.bno = b;
            this.bname = name;
            this.loc = l;
        }
      
        public void showres() {
            System.out.println("Bank Number: " + bno);
            System.out.println("Bank Name: " + bname);
            System.out.println("Location: " + loc);
           
        }
	
    }
    class Transaction extends Bank { 
     

        public void setVal(int b, String name, String l) {
            this.bno = b;
            this.bname = name;
            this.loc = l;
        }

        public void showres() {
            System.out.println("Bank Number: " + bno);
            System.out.println("Bank Name: " + bname);
            System.out.println("Location: " + loc);
           
        }
    }


public class Assignment9 {

	public static void main(String[] args) {
		
		Customer obj = new Customer();
        obj.setVal(123, "SBI Bank", "INDIA");
     
        
        System.out.println("Customer Details:");
       obj.showres();

       
        Transaction obj1 = new Transaction();
       obj1.setVal(456, "ICICI", "INDIA");
      
      
        System.out.println("Transaction Details:");
        obj1.showres();

	}

}



