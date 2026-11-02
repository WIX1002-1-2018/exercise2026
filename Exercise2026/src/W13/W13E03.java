package W13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Checked or unchecked?
// IOException is checked: the compiler makes every caller catch it or declare it with throws.
// RuntimeException (and its subclasses, such as ClassCastException) and Error are unchecked: no such rule.
// Both kinds happen while the program runs; only the compile-time rule differs.
// Here the depot note was saved with a broken character, so reading it as UTF-8 text fails.
public class W13E03 {
    static String readNote(Path file) throws IOException {
        return Files.readString(file);
    }

    static void show(Path note) {
        try {
            System.out.println(readNote(note));
        } catch (IOException e) {
            System.out.println("Could not read the note: " + e.getClass().getSimpleName());
        }
        // Try it: delete the try { and the whole catch block, keep the line inside,
        // then read the compiler message.
    }

    public static void main(String[] args) throws IOException {
        Path note = Path.of("depot_note_e03.txt");
        Files.write(note, new byte[] {'M', 'Y', (byte) 0xFF, '1'});   // set-up: one byte is not valid UTF-8
        show(note);
    }
}
