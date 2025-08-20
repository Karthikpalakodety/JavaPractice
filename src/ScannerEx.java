import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        System.out.println("Enter grade:");
        char grade=scanner.next().charAt(0);    //scanner.next() reads a single word
                                                // charAt(0) extracts the first character of that input string

        System.out.println("Enter CGPA:");
        double cgpa = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("CGPA: " + cgpa);

    }
}
