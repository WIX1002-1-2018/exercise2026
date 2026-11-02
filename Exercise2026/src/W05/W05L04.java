package W05;

import java.util.Scanner;

public class W05L04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0-6): ");
        int firstDay = input.nextInt();

        // Check leap year
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        // Calculate days before May
        int daysBeforeMay = 31 + 28 + 31 + 30;

        if (isLeapYear) {
            daysBeforeMay++;
        }

        // Calculate days before August
        int daysBeforeAugust = daysBeforeMay + 31 + 30 + 31;

        // Calculate the first day of May and August
        int mayStartDay = (firstDay + daysBeforeMay) % 7;
        int augustStartDay = (firstDay + daysBeforeAugust) % 7;

        // Display May calendar
        displayMonth("May", 31, mayStartDay);

        // Display August calendar
        displayMonth("August", 31, augustStartDay);

        input.close();
    }

    public static void displayMonth(String month, int days, int firstDay) {

        System.out.println("\n       " + month);
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print blank spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
