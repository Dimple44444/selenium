package StringDemoAssignment6;

import java.util.Scanner;

public class lengthUsingWhile {

	public static void main(String[] args) {
		int i=0;
		String name;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your name");
		name= sc.nextLine();
		String [] s = name.split("");
		int count = 0;
		while(i<s.length) {
			count+=1;
			i++;
		}
		System.out.println("count:"+count);
		
		
	}
}


