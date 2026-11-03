package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Forgetting close(): PrintWriter keeps short text in a buffer in memory first.
// flush() sends the buffer to the file; close() flushes and then frees the file.
// Here the line is still in the buffer, so the file is empty until close().
public class W09E05 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("note.txt");
        PrintWriter out = new PrintWriter(new FileOutputStream(f));
        out.println("Bring the lab sheet");
        System.out.println("Before close: " + f.length() + " bytes");
        out.close();
        System.out.println("After close:  " + f.length() + " bytes");
        // Try it: remove out.close(); run, then open note.txt. It is empty.
    }
}
