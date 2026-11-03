import java.math.BigInteger;
import java.util.Scanner;

public class LargeIntegerInput {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = 0, sum = 0;
        for (long i=1; i <= n; i++){
            temp += i;
            sum += temp;
        }
        System.out.print("Result: " + sum);
    }
}