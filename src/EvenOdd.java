import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of A:");
        int A = scanner.nextInt();

        if (A % 2 == 0){
            System.out.println("Number is even.");
        }else {
            System.out.print("Number is odd");
        }

    }
}
