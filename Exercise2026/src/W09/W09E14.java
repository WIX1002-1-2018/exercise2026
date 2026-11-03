package W09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Write a binary file: ObjectOutputStream writes values as bytes, not as text.
// An int takes 4 bytes and a double 8 bytes. The file does not label each value,
// so the reader must know the types and the order (see W09E15).
public class W09E14 {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("highscore.dat"))) {
            out.writeUTF("Aisyah");          // a String
            out.writeInt(9450);              // an int
            out.writeDouble(37.5);           // a double (seconds)
        }
        System.out.println("highscore.dat: " + new File("highscore.dat").length() + " bytes");
        // 26 bytes = 20 bytes of data (8 for "Aisyah" with its length, 4 for the int, 8 for the double)
        // + 6 bytes the stream adds to describe itself.
        // Open highscore.dat in a text editor: the name is readable, the numbers are not.
    }
}
