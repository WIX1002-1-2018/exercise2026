package W05;

import java.util.Scanner;

public class W05L01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = sc.nextInt();

        System.out.print("The factors are: ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i == number) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println();

        sc.close();
    }
}
