package W09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Closing a file safely. try-with-resources (Java 7) closes the file automatically,
// even if something goes wrong inside the block. The older way needs finally.
// (try, catch and finally are covered fully in Week 13.)
public class W09E12 {
    public static void main(String[] args) throws IOException {
        // 1. try-with-resources: out is closed at the closing brace
        try (PrintWriter out = new PrintWriter(new FileWriter("checklist.txt"))) {
            out.println("[x] Watch video #41");
            out.println("[ ] Run W09E01 to W09E05");
        }
        System.out.println("checklist.txt written with try-with-resources");

        // 2. The older way, which you will meet in older code (finally is explained in Week 13):
        //    close in finally, after checking that the file was opened
        PrintWriter old = null;
        try {
            old = new PrintWriter(new FileWriter("checklist_old.txt"));
            old.println("[x] Watch video #41");
        } finally {
            if (old != null) {
                old.close();
            }
        }
        System.out.println("checklist_old.txt written with try and finally");
    }
}
