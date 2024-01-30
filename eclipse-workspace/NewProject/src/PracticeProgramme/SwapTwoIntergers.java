package PracticeProgramme;

import java.util.Scanner;

public class SwapTwoIntergers {

	public static void main(String[] args) {
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1= s2.nextInt();
		System.out.println("Enter 2nd number");
		int num2= s2.nextInt();
		 System.out.println("Before Swapping numbers are: ");
	     System.out.println("The first Number is "+num1);
	     System.out.println("The second Number is "+num2);
	     
	     int temp1= num1;
	     num1=num2;
	     num2= temp1;
	     System.out.println("After Swapping numbers are: ");
	     System.out.println("The first Number is "+num1);
	     System.out.println("The second Number is "+num2);
		
		
				
		
		
		
	}

}
