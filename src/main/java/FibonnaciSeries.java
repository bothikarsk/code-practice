import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {

        int a=0;
        int b=0;
        int c=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number till series: ");
        int number=scanner.nextInt();
        for(int i=0;i<=number;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
        }
    }
}
