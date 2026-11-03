import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        int sum = 0;
        int partialSum = 0;

        for (int i = 1; i <= n; i++) {
            partialSum += i;
            sum += partialSum;
        }
        System.out.println("Sum of series = " + sum);
        input.close();
    }
}