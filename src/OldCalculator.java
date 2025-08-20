import java.util.Scanner;

public class OldCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A value:");
        double A = scanner.nextDouble();

        System.out.print("Enter B value:");
        double B = scanner.nextDouble();

        System.out.print("Enter operator(+,-,*,/,%) : ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator){
            case '+':
                result = A+B;
                break;
            case  '-':
                 result = A-B;
                 break;
            case '*' :
                result = A*B;
                break;
            case '/':
                if (B!=0){
                    result = A/B;
                }else {
                    System.out.print("Error! Divided by Zero.");
                    return;
                }
                break;
            case  '%' :
                result = A%B;
                break;
        }
                  System.out.println("Result : " + result);
    }
}
