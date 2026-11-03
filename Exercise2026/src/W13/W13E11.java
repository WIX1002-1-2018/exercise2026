package W13;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// throws declares that a method may pass a checked exception to its caller; it does not throw anything itself.
// Calls: main -> loadManifest -> readFirstLine.
// The exception travels back: readFirstLine -> loadManifest -> main.
// The lines after each call are skipped, and main reports the problem.
// The manifest was saved with a broken character, so reading it as UTF-8 text fails.
public class W13E11 {
    static String readFirstLine(Path file) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(file)) {
            return in.readLine();
        }
    }

    static void loadManifest(Path file) throws IOException {
        System.out.println("loading " + file);
        String first = readFirstLine(file);
        System.out.println("first parcel: " + first);        // skipped when readFirstLine throws
    }

    public static void main(String[] args) throws IOException {
        Path manifest = Path.of("manifest_e11.txt");
        Files.write(manifest, new byte[] {'M', 'Y', (byte) 0xFF, '\n'});   // set-up: not valid UTF-8

        try {
            loadManifest(manifest);
            System.out.println("manifest loaded");            // skipped too
        } catch (IOException e) {
            System.out.println("main caught " + e.getClass().getSimpleName());
        }
    }
}
