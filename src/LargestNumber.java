import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N1: ");
        int N1 = scanner.nextInt();
        System.out.print("Enter N2: ");
        int N2 = scanner.nextInt();
        System.out.print("Enter N3: ");
        int N3 = scanner.nextInt();

        if (N1 >= N2 && N1 >= N3) {
            System.out.println(N1 + " is the largest number.");
        } else if (N2 >= N3 && N2 >= N1) {
            System.out.println(N2 + " is the largest number.");
        } else {
            System.out.println(N3 + " is the largest number.");
        }
        scanner.close();
    }
}
