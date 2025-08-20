import java.util.Scanner;

public class Operations {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        double A = scanner.nextDouble();
        System.out.println("Enter B:");
        double B = scanner.nextDouble();

        double add = A+B;
        System.out.println("ADD(A+B):" +add);
        double sub =A-B;
        System.out.println("SUB(A-B):" +sub);
        double mul = A*B;
        System.out.println("MUL(A*B):" +mul);
        double div =A/B;
        System.out.println("DIV(A/B):" +div);

        scanner.close();
    }
}
