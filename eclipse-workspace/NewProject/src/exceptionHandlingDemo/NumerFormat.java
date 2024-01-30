package exceptionHandlingDemo;

import java.util.Scanner;

public class NumerFormat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter a number: ");
            String userInput = scanner.nextLine();

            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            
            System.out.println("Invalid input Please enter a valid number.");
        } finally {
            
            scanner.close();


	}

}
}
