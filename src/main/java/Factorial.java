import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num= scanner.nextInt();
        int factorial=1;
        while(num>0){
            factorial= factorial*num;
            num--;
        }
        System.out.println("Factorial: "+factorial);
    }
}
