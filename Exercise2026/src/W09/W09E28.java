package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

// Try it answer for video #42 (try it yourself first): quiz_marks.csv has name,mark on each line
// (no header; a mark is a whole number from 0 to 100). Count how many passed (50 or more) and how many
// failed, and skip a line whose mark is not a valid mark.
// If quiz_marks.csv is not there yet, the program makes a sample; edit the file and run it again.
public class W09E28 {
    // the mark in the text, or -1 if it is not ONE whole number from 0 to 100 and nothing else
    static int toMark(String text) {
        try (Scanner s = new Scanner(text.trim()).useLocale(Locale.ROOT)) {
            if (!s.hasNextInt()) {
                return -1;
            }
            int mark = s.nextInt();
            if (s.hasNext() || mark < 0 || mark > 100) {
                return -1;
            }
            return mark;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("quiz_marks.csv");
        if (!file.exists()) {                                   // a sample, only the first time
            try (PrintWriter out = new PrintWriter(file)) {
                out.println("Aisyah,78");
                out.println("Ben,45");
                out.println("Chong,50");
                out.println("Devi,absent");
                out.println("Eric,91");
            }
        }

        int pass = 0, fail = 0;
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] part = line.split(",", -1);
                int mark = part.length == 2 ? toMark(part[1]) : -1;   // two fields, and a valid mark
                if (mark == -1) {
                    System.out.println("Skipped: " + line);
                    continue;
                }
                if (mark >= 50) {
                    pass++;
                } else {
                    fail++;
                }
            }
        }
        System.out.println("Passed: " + pass + ", failed: " + fail);
    }
}
