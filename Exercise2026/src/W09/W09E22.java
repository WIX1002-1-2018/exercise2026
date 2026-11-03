package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Common file mistakes.
public class W09E22 {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("marks.txt")) {
            out.println("85 72 90");
        }

        // Mistake 1: new Scanner("marks.txt") reads the TEXT "marks.txt", not the file.
        Scanner wrong = new Scanner("marks.txt");
        System.out.println("Wrong Scanner reads: " + wrong.nextLine());
        wrong.close();
        Scanner right = new Scanner(new File("marks.txt"));    // correct: wrap the name in a File
        System.out.println("Right Scanner reads: " + right.nextLine());
        right.close();

        // Mistake 2: opening a file that is not there throws FileNotFoundException.
        // Check first, and give a clear message.
        File f = new File("mark.txt");                         // spelling mistake in the name
        if (!f.exists()) {
            System.out.println("Cannot find " + f.getAbsolutePath());
        }
        // Try it: remove the if and write new Scanner(new File("mark.txt")). Run it and read the error.
    }
}
