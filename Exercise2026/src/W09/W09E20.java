package W09;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Folders: mkdirs() makes a folder (and any missing parent folders);
// listFiles() gives the files and folders inside it.
public class W09E20 {
    public static void main(String[] args) throws IOException {
        File folder = new File("reports/week09");
        boolean made = folder.mkdirs();                  // false: it was already there, or it could not be made
        if (!folder.isDirectory()) {
            System.out.println("Could not make the folder " + folder.getPath());
            return;
        }
        System.out.println("Folder made now: " + made);
        new File(folder, "quiz.txt").createNewFile();
        new File(folder, "attendance.txt").createNewFile();
        new File(folder, "old").mkdir();

        File[] items = folder.listFiles();               // null if the folder cannot be read
        if (items == null) {
            System.out.println("Cannot list " + folder.getPath());
            return;
        }
        Arrays.sort(items);                    // the order from the disk can vary
        for (File item : items) {
            String kind = item.isDirectory() ? "[folder]" : "[file]  ";
            System.out.println(kind + " " + item.getName());
        }
    }
}
