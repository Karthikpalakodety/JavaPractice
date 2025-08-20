import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int originalNumber = number; // Store the original number to compare later
        int sum = 0;  // Variable to store the sum of the powers of the digits
        int numDigits = String.valueOf(number).length(); // Calculate the number of digits in the number
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += Math.pow(digit, numDigits); // Raise the digit to the power of the number of digits and add to sum
            number /= 10;  // Remove the last digit from the number
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
