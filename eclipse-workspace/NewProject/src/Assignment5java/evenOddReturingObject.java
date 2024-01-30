package Assignment5java;

class EvenOdd
{
//	public static final String EvenOdd = null;
	private int num;
	
	EvenOdd(int num)
	
	{
		this.num= num;
	}
	
	public boolean isEven() {
        return num % 2 == 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return num % 2 != 0;
}





public class evenOddReturingObject {

	public void main(String[] args) {
		EvenOdd obj= new EvenOdd(23);
	      obj.isEven();
		 if (isEven()) {
	            System.out.println("The number is even.");
	        } else if (isOdd()) {
	            System.out.println("The number is odd.");
	        } else {
	            System.out.println("Invalid number.");
	        }
	}
}
}

