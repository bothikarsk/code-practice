import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String or number: ");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        String reverse = stringBuilder.reverse().toString();
        if (input.equals(reverse)) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }
    }
}
