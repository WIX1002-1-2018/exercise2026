package W13;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Deck exercise: nested try.
// The outer try handles opening, reading and closing the manifest; the inner try handles each line.
// A line error is caught inside, so it never reaches the outer handler.
// Without the inner catch, NumberFormatException would escape: catch (IOException e) cannot catch it.
public class W13E18 {
    public static void main(String[] args) throws IOException {
        Path manifest = Path.of("manifest_e18.txt");
        Files.writeString(manifest, "2.0\nten\n3.5\n");       // set-up, outside the outer try
        double total = 0;
        boolean complete = true;
        try (BufferedReader in = Files.newBufferedReader(manifest)) {
            String line;
            while ((line = in.readLine()) != null) {
                try {
                    double w = Double.parseDouble(line);
                    if (Double.isFinite(w) && w > 0) {
                        total += w;
                    } else {
                        System.out.println("inner: skipped " + line + " (not a valid weight)");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("inner: skipped \"" + line + "\"");
                }
            }
        } catch (IOException e) {
            complete = false;
            System.out.println("outer: cannot read the manifest");
        }
        System.out.println((complete ? "accepted subtotal: " : "incomplete, accepted so far: ") + total + " kg");
    }
}
