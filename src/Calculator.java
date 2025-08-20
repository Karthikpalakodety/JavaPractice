import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter num2:");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator from these (+,-,*,/,%) : ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        switch (operator){
            case '+' -> result= num1 + num2;
            case '-' -> result= num1 - num2;
            case '*' -> result= num1 * num2;
            case '%' -> result = num1 % num2;
            case '/' -> {
                if (num2!=0){
                    result = num1/num2;

                } else {
                    System.out.println("Error!! While value is dividing my zero");
                }
            }

        }
        System.out.println("Result: " + result);
    }
}
