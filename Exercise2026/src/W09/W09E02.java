package W09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Write a text file: PrintWriter has print, println and printf, like System.out.
// FileOutputStream creates the file (or empties it if it is already there).
public class W09E02 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("attendance.txt"));
        out.println("WIX1002 K2 attendance, Week 9");
        out.println("Aisyah, present");
        out.println("Ben, present");
        out.printf("%s, %s%n", "Chong", "absent");
        out.close();
        if (out.checkError()) {                    // PrintWriter does not throw while writing; ask it instead
            System.out.println("Could not write attendance.txt");
        } else {
            System.out.println("attendance.txt written (4 lines)");
        }
    }
}
