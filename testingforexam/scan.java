import java.util.Scanner;
import java.util.Random;

public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Value you entered is : " + n);
        Random r = new Random();
        long num = r.longs();
        System.out.println(num);
    }
}