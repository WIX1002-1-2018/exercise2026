package W09;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Read records until the end of a binary file. ObjectInputStream has no hasNext() like Scanner:
// reading past the end throws EOFException, so we catch it to stop the loop.
// (This assumes every record was written completely; the full try/catch story is in Week 13.)
public class W09E16 {
    public static void main(String[] args) throws IOException {
        String[] names = {"Aisyah", "Ben", "Chong"};
        int[] scores = {9450, 8700, 9020};
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("leaderboard.dat"))) {
            for (int i = 0; i < names.length; i++) {
                out.writeUTF(names[i]);
                out.writeInt(scores[i]);
            }
        }

        int count = 0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("leaderboard.dat"))) {
            while (true) {
                String name = in.readUTF();
                int score = in.readInt();
                count++;
                System.out.println(count + ". " + name + " " + score);
            }
        } catch (EOFException e) {
            System.out.println("End of file: " + count + " records");
        }
    }
}
