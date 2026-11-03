package W09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Try it answer for video #43 (try it yourself first): a method saveLines(file, lines) that writes
// an array of Strings with BufferedWriter, and a method lastLine(file) that reads the file with
// BufferedReader and returns its last line (null for an empty file). Both use try-with-resources.
public class W09E29 {
    static void saveLines(String fileName, String[] lines) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                out.write(line);
                out.newLine();
            }
        }
    }

    static String lastLine(String fileName) throws IOException {
        String last = null;
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                last = line;                     // keep the newest line read
            }
        }
        return last;
    }

    public static void main(String[] args) throws IOException {
        String[] menu = {"Nasi lemak", "Mee goreng", "Roti canai", "Teh tarik"};
        saveLines("menu.txt", menu);
        System.out.println("Last item on the menu: " + lastLine("menu.txt"));
    }
}
