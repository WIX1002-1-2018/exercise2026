package W09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

// Text or binary? The same 1000 numbers saved both ways, and the file sizes compared.
// Text: each digit is a character, plus a line break (1 byte on Linux and macOS, 2 on Windows).
// Binary: every int is 4 bytes, plus a few bytes the stream adds at the start.
public class W09E17 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter text = new PrintWriter("numbers.txt");
             ObjectOutputStream bin = new ObjectOutputStream(new FileOutputStream("numbers.dat"))) {
            for (int i = 1; i <= 1000; i++) {
                int n = 100000 + i;          // six digits each
                text.println(n);
                bin.writeInt(n);
            }
        }
        System.out.println("numbers.txt: " + new File("numbers.txt").length() + " bytes (readable)");
        System.out.println("numbers.dat: " + new File("numbers.dat").length() + " bytes (not readable)");
    }
}
