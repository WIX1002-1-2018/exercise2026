package W09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

// Optional preview (objects come in Week 10): save a whole array in one step with writeObject,
// and read it back with readObject. readObject returns an Object, so we cast it back to int[].
public class W09E18 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] rainfall = {12, 0, 33, 8, 21, 0, 15};
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("rainfall.dat"))) {
            out.writeObject(rainfall);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("rainfall.dat"))) {
            int[] back = (int[]) in.readObject();
            System.out.println("Loaded: " + Arrays.toString(back));
            System.out.println("Same values: " + Arrays.equals(rainfall, back));
        }
    }
}
