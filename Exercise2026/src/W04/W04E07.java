package W04;

import java.util.Scanner;

// do-while: the body runs first, the condition is tested after it, so the body runs at least once.
// A menu is the classic use: show it, act on the choice, repeat until 0. Try with: 1 2 1 0
public class W04E07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance = 10.00;
        int choice;
        do {
            System.out.println("1 Balance  2 Top up RM 5  0 Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1 -> System.out.printf("Balance: RM %.2f%n", balance);
                case 2 -> {
                    balance = balance + 5;
                    System.out.println("Topped up RM 5.00");
                }
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Unknown choice");
            }
        } while (choice != 0);    // note the semicolon after the condition
        in.close();
    }
}
