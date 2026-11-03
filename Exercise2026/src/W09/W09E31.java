package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Try it answer for video #45 (try it yourself first): make a folder w09_archive, write notes.txt in it,
// print its size, then rename it to notes_old.txt. Check every true/false result.
public class W09E31 {
    public static void main(String[] args) throws FileNotFoundException {
        File folder = new File("w09_archive");
        boolean made = folder.mkdirs();                  // false if it was already there, or could not be made
        if (!made && !folder.isDirectory()) {
            System.out.println("Cannot make w09_archive");
            return;
        }
        File notes = new File(folder, "notes.txt");
        File old = new File(folder, "notes_old.txt");
        if (notes.exists() || old.exists()) {
            System.out.println("w09_archive already has the files; delete them to run again.");
            return;
        }
        PrintWriter out = new PrintWriter(notes);
        out.println("Week 9: files");
        out.close();
        if (out.checkError()) {
            System.out.println("Could not write notes.txt");
            return;
        }
        System.out.println("notes.txt size: " + notes.length() + " bytes");
        boolean renamed = notes.renameTo(old);
        System.out.println("Renamed: " + renamed + ", notes_old.txt exists: " + old.exists());
    }
}
