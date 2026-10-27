package W04;

import java.util.Scanner;

// Lab 3, question 3: read the sales volume and print the commission (two decimal places).
// Rate: up to 100 -> 5%, up to 500 -> 7.5%, up to 1000 -> 10%, above 1000 -> 12.5%.
// Test: 100 -> 5.00, 400 -> 30.00, 1000 -> 100.00, 2000 -> 250.00.
public class W04L03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the sales volume: ");
        double sales = keyboard.nextDouble();

        double rate;
        if (sales <= 100) {                              // check the smallest range first
            rate = 0.05;
        } else if (sales <= 500) {                       // here sales is already more than 100
            rate = 0.075;
        } else if (sales <= 1000) {                      // here sales is already more than 500
            rate = 0.10;
        } else {                                         // more than 1000
            rate = 0.125;
        }

        double commission = sales * rate;

        System.out.printf("The commission is %.2f%n", commission);   // %.2f: two decimal places
        
    }
}
