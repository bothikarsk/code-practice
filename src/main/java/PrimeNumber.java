import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPrime(number);

    }

    public static boolean isPrime(int number) {
        if (number <= 0) {
            System.out.println("please enter valid number");
            System.exit(0);
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Not prime");
                return false;
            }
        }
        System.out.println("Prime number");
        return true;
    }
}
