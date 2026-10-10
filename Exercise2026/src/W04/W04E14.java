package W04;

import java.util.Random;
import java.util.Scanner;

// Guessing game: loop until the guess is right, with a hint after every wrong guess.
// new Random(1002) uses a fixed seed, so the secret is the same on every run (handy for testing).
// Remove 1002 to get a new secret each run. The input is not checked, to keep the example short.
public class W04E14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random(1002);
        int secret = rng.nextInt(1, 101);
        int guess = 0;
        int tries = 0;
        while (guess != secret) {
            System.out.print("Guess (1 to 100): ");
            guess = in.nextInt();
            tries++;
            if (guess < secret) {
                System.out.println("Higher");
            } else if (guess > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct in " + tries + " tries");
            }
        }
        in.close();
    }
}
