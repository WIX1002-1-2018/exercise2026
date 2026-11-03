package W09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Read a binary file in the SAME order and with the SAME types as it was written:
// writeUTF, writeInt, writeDouble  ->  readUTF, readInt, readDouble.
public class W09E15 {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("highscore.dat"))) {
            out.writeUTF("Aisyah");
            out.writeInt(9450);
            out.writeDouble(37.5);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("highscore.dat"))) {
            String name = in.readUTF();
            int score = in.readInt();
            double seconds = in.readDouble();
            System.out.println(name + " scored " + score + " in " + seconds + " s");
        }
        // Try it: swap the order to readInt() first, then readUTF(). Run it and read the result.
    }
}
