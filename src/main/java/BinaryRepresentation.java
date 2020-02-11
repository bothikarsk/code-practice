import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=scanner.nextInt();
        String str="";
        while (number>0){
            int remainder=number%2;
            str+=Integer.toString(remainder);
            number=number/2;
        }

        System.out.println("Binary: "+new StringBuilder(str).reverse());
    }
}
