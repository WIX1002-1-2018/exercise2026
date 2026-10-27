package W09;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Try it answer for video #44 (try it yourself first): save three city records (a String and a double)
// in weather.dat, then read them back until the end of the file, print the cities above 30.0 degrees
// and how many there are. (This assumes every record was written completely; more in Week 13.)
public class W09E30 {
    public static void main(String[] args) throws IOException {
        String[] cities = {"Kuala Lumpur", "Cameron Highlands", "Alor Setar"};
        double[] temps = {32.5, 21.0, 33.8};
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("weather.dat"))) {
            for (int i = 0; i < cities.length; i++) {
                out.writeUTF(cities[i]);
                out.writeDouble(temps[i]);
            }
        }

        int hot = 0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("weather.dat"))) {
            while (true) {
                String city = in.readUTF();          // same order and types as written
                double temp = in.readDouble();
                if (temp > 30.0) {
                    System.out.println(city + ": " + temp);
                    hot++;
                }
            }
        } catch (EOFException e) {
            System.out.println(hot + " cities above 30.0");
        }
    }
}
