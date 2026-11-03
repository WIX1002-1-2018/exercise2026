package W09;

import java.io.File;
import java.io.IOException;

// The File class describes a file or folder; it does not read or write the contents.
public class W09E19 {
    public static void main(String[] args) throws IOException {
        File f = new File("notes_w09.txt");
        System.out.println("Created now:   " + f.createNewFile());   // false if it was already there
        System.out.println("Name:          " + f.getName());
        System.out.println("Path:          " + f.getPath());
        System.out.println("Exists:        " + f.exists());
        System.out.println("Is a file:     " + f.isFile());
        System.out.println("Is a folder:   " + f.isDirectory());
        System.out.println("Size (bytes):  " + f.length());
        System.out.println("Can read:      " + f.canRead());
        System.out.println("Can write:     " + f.canWrite());
        System.out.println("Has a time:    " + (f.lastModified() > 0));   // lastModified() is a time in milliseconds
        File missing = new File("no_such_file.txt");
        System.out.println("no_such_file.txt exists: " + missing.exists());
    }
}
