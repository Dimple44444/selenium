package testAndLearn;

import java.util.Scanner;

public class scannerClass {

	public scannerClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Taking number from inputs");
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter first number");
//		int a= sc.nextInt()	;
//		
//		System.out.println("Enter second number");
//		int a1= sc.nextInt();
//		
//		
//		int sum= a+a1;
//		System.out.println("sum of twp numbers is:");
//		System.out.println(sum);
		
		boolean b1= sc.hasNextInt();
		System.out.println(b1);
		
				

	}

}
