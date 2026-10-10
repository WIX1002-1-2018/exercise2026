package W04;

import java.util.Scanner;

// INTENTIONALLY FAULTY (AI agent check). Task given to the agent: "read daily steps until -1,
// then print the number of days and the total". The agent wrote this do-while. It compiles.
// Try with: 5000 4000 6000 -1   (expected: Days: 3, total steps: 15000)
public class W04E18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steps;
        int days = 0;
        int total = 0;
        do {
            System.out.print("Steps today (-1 to finish): ");
            steps = in.nextInt();
            total = total + steps;
            days++;
        } while (steps != -1);
        System.out.println("Days: " + days + ", total steps: " + total);
        in.close();
    }
}
