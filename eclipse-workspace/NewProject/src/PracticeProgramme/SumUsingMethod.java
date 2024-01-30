package PracticeProgramme;

import java.util.Scanner;

public class SumUsingMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1= sc.nextInt();
		
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		
		sc.close();
		
		sumNum(num1,num2); 
	}
		
		public static void sumNum(int num_A,int num_B){
			int sum=0;
			sum=num_A+num_B;
			System.out.println("Sum of two numbers : "+sum);
		
		
		
		
		
		
	
		
		
		

	}

}
