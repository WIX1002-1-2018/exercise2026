package W09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// Modern Java (good to know): java.nio.file reads and writes a small text file in one line.
// Path.of names the file; Files.writeString and Files.readString (Java 11) do the work.
public class W09E23 {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("goals.txt");
        Files.writeString(p, """
                Pass the midterm
                Finish the group assignment
                Learn Git branches
                """);                                          // a text block (Java 15) as the file contents

        String all = Files.readString(p);                      // the whole file as one String
        System.out.print(all);

        List<String> lines = Files.readAllLines(p);            // one String per line (a List is like a growable array)
        System.out.println("Lines: " + lines.size() + ", first: " + lines.get(0));
        System.out.println("Exists: " + Files.exists(p) + ", size: " + Files.size(p) + " bytes");
    }
}
