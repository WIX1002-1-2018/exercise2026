package W04;

import java.util.Scanner;

// User-confirmation loop: repeat while the user answers y. Try with: 30 y 100 n
public class W04E06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            System.out.print("Celsius: ");
            double c = in.nextDouble();
            System.out.printf("%.1f C = %.1f F%n", c, c * 9 / 5 + 32);
            System.out.print("Convert another? (y/n): ");
            again = in.next();
        }
        System.out.println("Bye");
        in.close();
    }
}
