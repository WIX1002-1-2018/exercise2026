package W05;

/**
 *
 * @author huiling
 */

import java.util.Scanner;

public class W05L04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        // Find the first day of May
        int mayFirstDay = firstDay;

        for (int month = 1; month < 5; month++) {
            mayFirstDay = (mayFirstDay + getDaysInMonth(month, year)) % 7;
        }

        // Display May
        displayCalendar("May", 5, year, mayFirstDay);

        // Find the first day of August
        int augustFirstDay = mayFirstDay;

        for (int month = 5; month < 8; month++) {
            augustFirstDay = (augustFirstDay + getDaysInMonth(month, year)) % 7;
        }

        // Display August
        displayCalendar("August", 8, year, augustFirstDay);

        input.close();
    }

    // Get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Check whether the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    // Display the calendar
    public static void displayCalendar(String name, int month, int year, int firstDay) {
        System.out.println("\n       " + name + " " + year);
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        int days = getDaysInMonth(month, year);

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
 