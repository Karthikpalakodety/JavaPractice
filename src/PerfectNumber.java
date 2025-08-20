import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //User input

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
        scanner.close();
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {                                           //Calculation part
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
/*The isPerfectNumber method checks if sum of the divisors of the number
is equal to the number. If it is, the number is a perfect number.*/

