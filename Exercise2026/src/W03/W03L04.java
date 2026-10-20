package W03;

import java.util.Scanner;

// Lab 2, question 4: convert a number of seconds to hours, minutes and seconds, printed as hh:mm:ss.
// Answer by Azzam (@azzamaziz-2026), PR #11. Test: 3661 -> 01:01:01, 123456 -> 34:17:36.
public class W03L04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input seconds to convert: ");
        int inputSeconds = scanner.nextInt();

        int hours = inputSeconds / 3600;                  // 3600 seconds in one hour (integer division)
        int minutes = (inputSeconds % 3600) / 60;         // seconds left after the hours, in whole minutes
        int seconds = inputSeconds % 60;                  // seconds left after the minutes

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);   // %02d: at least two digits, e.g. 01
        scanner.close();
    }
}
