package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// W09E25 fixed: the writer is closed (by try-with-resources) BEFORE the file is read,
// so the three names are really on the disk when the Scanner opens the file.
public class W09E26 {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("team.txt")) {
            out.println("Aisyah");
            out.println("Ben");
            out.println("Chong");
        }

        int count = 0;
        try (Scanner in = new Scanner(new File("team.txt"))) {
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
                count++;
            }
        }
        System.out.println(count + " names read");
    }
}
