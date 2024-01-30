package exceptionHandlingDemo;

public class NullPointer {

	public static void main(String[] args) {
		 String text = null;

	        try {
	           
	            int length = text.length();
	            System.out.println("Length of the string: " + length);
	        } catch (NullPointerException e) {
	         
	         System.out.println("NullPointerException caught: " + e);
	        }
	    }
	}


