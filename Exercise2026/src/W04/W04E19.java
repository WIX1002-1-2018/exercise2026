package W04;

import java.util.Scanner;

// Fix of W04E18: use the sentinel pattern. Read before the loop, test, use, read again at the end.
// The sentinel -1 is never added and never counted. Try with: 5000 4000 6000 -1   and with just -1.
public class W04E19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = 0;
        int total = 0;
        System.out.print("Steps today (-1 to finish): ");
        int steps = in.nextInt();
        while (steps != -1) {
            total = total + steps;
            days++;
            System.out.print("Steps today (-1 to finish): ");
            steps = in.nextInt();
        }
        System.out.println("Days: " + days + ", total steps: " + total);
        in.close();
    }
}
