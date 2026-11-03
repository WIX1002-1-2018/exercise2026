package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Rename (or move) with renameTo, and remove with delete. Both return true if they worked
// and false if they did not, so always check the result before going on.
// It works only with two demo files in its own folder, w09_demo, and stops if either is already there.
public class W09E21 {
    public static void main(String[] args) throws FileNotFoundException {
        File folder = new File("w09_demo");
        folder.mkdirs();
        if (!folder.isDirectory()) {
            System.out.println("Cannot use the folder w09_demo");
            return;
        }
        File draft = new File(folder, "w09e21_draft.txt");
        File done = new File(folder, "w09e21_final.txt");
        if (draft.exists() || done.exists()) {
            System.out.println("A demo file is already in w09_demo; stop so nothing is overwritten.");
            return;
        }
        try (PrintWriter out = new PrintWriter(draft)) {
            out.println("Draft notes");
        }

        boolean renamed = draft.renameTo(done);
        System.out.println("Renamed: " + renamed);
        if (renamed) {
            System.out.println(draft.getName() + " exists: " + draft.exists());
            System.out.println(done.getName() + " exists: " + done.exists());
            System.out.println("Deleted: " + done.delete());
            System.out.println(done.getName() + " exists: " + done.exists());
        }
    }
}
