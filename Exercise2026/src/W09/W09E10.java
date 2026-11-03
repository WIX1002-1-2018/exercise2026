package W09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// BufferedReader reads a whole line at a time with readLine(); it returns null at the end of the file.
// The buffer reads a block of text at a time, so there are fewer trips to the disk for long files.
public class W09E10 {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("schedule.txt"));
        out.println("Week 9   File Input and Output");
        out.println("Week 10  Class");
        out.println("Week 11  Inheritance");
        out.println("Week 12  Polymorphism");
        out.println("Week 13  Exception Handling");
        out.close();

        BufferedReader in = new BufferedReader(new FileReader("schedule.txt"));
        String line;
        int count = 0;
        while ((line = in.readLine()) != null) {        // read, then test for the end
            System.out.println(line);
            count++;
        }
        in.close();
        System.out.println(count + " weeks to go");
    }
}
