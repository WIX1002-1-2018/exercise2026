package W09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter collects the text in memory and writes it to the disk in large blocks.
// write() writes text; newLine() ends the line in the way that suits the computer.
public class W09E11 {
    public static void main(String[] args) throws IOException {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        String[] plan = {
            "Lecture (DK2)", "Tutorial and lab (MM4)",
            "Self-study", "Watch the videos", "Revise"
        };
        BufferedWriter out = new BufferedWriter(new FileWriter("my_week.txt"));
        for (int i = 0; i < days.length; i++) {
            out.write(days[i] + ": " + plan[i]);
            out.newLine();
        }
        out.close();                                     // also flushes the buffer to the disk
        System.out.println("my_week.txt written with " + days.length + " lines");
    }
}
