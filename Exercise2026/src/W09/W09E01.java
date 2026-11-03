package W09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Why files: a variable lives in memory (RAM) and is lost when the program ends;
// a file on the disk keeps the value after the program ends.
public class W09E01 {
    public static void main(String[] args) throws FileNotFoundException {
        int steps = 8452;                          // in memory: gone when main ends
        System.out.println("Steps today (in memory): " + steps);

        PrintWriter out = new PrintWriter(new FileOutputStream("steps.txt"));
        out.println(steps);                        // on the disk: still there tomorrow
        out.close();                               // close() sends any text still in memory to the file, then frees it
        System.out.println("Saved to steps.txt");
    }
}
