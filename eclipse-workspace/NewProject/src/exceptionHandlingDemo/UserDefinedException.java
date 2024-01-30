package exceptionHandlingDemo;

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}


class Transaction {
    private int transId;

    public Transaction(int transId) {
        this.transId = transId;
    }

    
    public void performTransaction() throws InvalidTransactionException {
        
        if (transId != 100 && transId != 101 && transId != 102) {
           
            throw new InvalidTransactionException("Invalid transaction ID: " + transId);
        }

        System.out.println("Transaction ID " + transId + " processed successfully.");
    }
}

public class UserDefinedException {

	public static void main(String[] args) {
		try {
            
            Transaction trans1 = new Transaction(100);
            trans1.performTransaction();

            Transaction trans2 = new Transaction(101);
            trans2.performTransaction();

           
            Transaction trans3 = new Transaction(105);
            trans3.performTransaction();
        } catch (InvalidTransactionException e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }
		
	}


