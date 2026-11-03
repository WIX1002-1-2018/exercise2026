package W09;

import java.io.File;

// Where did the file go? A relative name such as "attendance.txt" is saved in the working folder.
// Usually: NetBeans uses the project folder (Exercise2026); VS Code uses the folder you opened.
// Settings can change this, so trust the "Working folder" line that the program prints.
public class W09E03 {
    public static void main(String[] args) {
        File f = new File("attendance.txt");
        System.out.println("Working folder: " + System.getProperty("user.dir"));
        System.out.println("Full path:      " + f.getAbsolutePath());
        System.out.println("Exists:         " + f.exists() + " (run W09E02 first)");
        // An absolute path names the place exactly. Use / in Java strings (it works on Windows too),
        // or \\ for one backslash: "C:/WIX1002/attendance.txt" or "C:\\WIX1002\\attendance.txt".
    }
}
