import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int temp = number;
        int iteration = Integer.toString(number).length();
        int cubeSum = 0;
        while (temp > 0) {
            int dig = temp % 10;
            cubeSum = cubeSum + cube(iteration, dig);
            temp = temp / 10;
        }
        if (number == cubeSum) {
            System.out.println(number + " is Armstrong number cubeSum: " + cubeSum);
        } else {
            System.out.println(number + " is not Armstrong number cubeSum: " + cubeSum);
        }
    }

    public static int cube(int iteration, int dig) {
        int num = 1;
        for (int i = 0; i < iteration; i++) {
            num *= dig;
        }
        return num;
    }
}
