package W04;

import java.util.Scanner;

// Sentinel-controlled loop: a special value (the sentinel, here 0) marks the end of the input. A price of 0 or less ends it.
// Pattern: read the first value BEFORE the loop, then read the next value at the END of the body.
// Try with: 12.50 3.90 8.00 0   and with just 0.
public class W04E05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double total = 0;
        System.out.print("Price (0 to finish): ");
        double price = in.nextDouble();
        while (price > 0) {
            total = total + price;
            count++;
            System.out.print("Price (0 to finish): ");
            price = in.nextDouble();    // without this line the loop never ends (an infinite loop)
        }
        System.out.printf("%d items, total RM %.2f%n", count, total);
        in.close();
    }
}
