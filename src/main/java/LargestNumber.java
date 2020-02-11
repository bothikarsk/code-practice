import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array numbers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int temp = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (temp < arr[i][j]) {
                    temp = arr[i][j];
                }
            }
        }
        System.out.println("max number: " + temp);
    }
}
