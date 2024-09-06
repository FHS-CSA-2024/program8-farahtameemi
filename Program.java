//import stuff here
import java.util.Scanner;
//Your code here
public class SimpleMathOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        // Calculate the required values
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double average = (number1 + number2) / 2.0;
        int absoluteValue = Math.abs(number1 - number2);
        int maximum = (number1 + number2 + absoluteValue) / 2;
        int minimum = (number1 + number2 - absoluteValue) / 2;

        // Print the results
        System.out.println("\nOriginal numbers are " + number1 + " and " + number2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Absolute value = " + absoluteValue);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        // Close the scanner
        scanner.close();
    }
}

//Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20

Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13
*/
