package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

// Read a text file line by line: Scanner on a File, hasNextLine() and nextLine().
public class W09E06 {
    public static void main(String[] args) throws FileNotFoundException {
        writeSample();                                   // makes reminders.txt so this file runs on its own
        Scanner in = new Scanner(new File("reminders.txt"));
        int lineNo = 0;
        while (in.hasNextLine()) {                       // true while there is another line
            String line = in.nextLine();
            lineNo++;
            System.out.println(lineNo + ": " + line);
        }
        in.close();
        System.out.println("(" + lineNo + " lines)");
    }

    static void writeSample() throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("reminders.txt"));
        out.println("Pull the latest exercise2026 code");
        out.println("Watch videos #41 to #45");
        out.println("Bring a laptop on Tuesday");
        out.close();
    }
}
