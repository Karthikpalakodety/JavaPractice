import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char ch = scanner.next().charAt(0);

        if (!Character.isLetter(ch)) {                // this line checks char is not a letter
            System.out.println("Invalid input");
        } else {
            ch = Character.toLowerCase(ch); //converts uppercase to lowercase
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}