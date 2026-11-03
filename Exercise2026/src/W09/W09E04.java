package W09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

// Overwrite or append: new FileOutputStream(name) starts the file again;
// new FileOutputStream(name, true) adds to the end. Run this program two or three times.
public class W09E04 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter fresh = new PrintWriter(new FileOutputStream("today.txt"));        // overwrite
        fresh.println("Signed in: Aisyah");
        fresh.close();

        PrintWriter log = new PrintWriter(new FileOutputStream("signin_log.txt", true)); // append
        log.println("Signed in: Aisyah");
        log.close();

        System.out.println("today.txt has " + countLines("today.txt") + " line(s)");
        System.out.println("signin_log.txt has " + countLines("signin_log.txt") + " line(s)");
    }

    static int countLines(String name) throws FileNotFoundException {
        Scanner in = new Scanner(new File(name));
        int n = 0;
        while (in.hasNextLine()) {
            in.nextLine();
            n++;
        }
        in.close();
        return n;
    }
}
