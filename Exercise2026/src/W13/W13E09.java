package W13;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// try-with-resources: Java calls close() on every resource opened in the brackets,
// even when an exception happens, and closes them in reverse order.
// The label printer and the scale are small AutoCloseable resources that print when closed.
class LabelPrinterE09 implements AutoCloseable {
    LabelPrinterE09() {
        System.out.println("printer opened");
    }

    void print(String line) {
        System.out.println("label: " + line);
    }

    @Override
    public void close() {
        System.out.println("printer closed");
    }
}

class ScaleE09 implements AutoCloseable {
    ScaleE09() {
        System.out.println("scale opened");
    }

    void weigh(String line) {
        System.out.println("weighed " + line.substring(0, line.indexOf(',')));
    }

    @Override
    public void close() {
        System.out.println("scale closed");
    }
}

public class W13E09 {
    public static void main(String[] args) throws IOException {
        Path manifest = Path.of("manifest_e09.txt");
        Files.writeString(manifest, "MY30054,1.5\nMY30055,2.5\n");

        try (LabelPrinterE09 printer = new LabelPrinterE09();
             ScaleE09 scale = new ScaleE09();
             BufferedReader in = Files.newBufferedReader(manifest)) {
            String line;
            while ((line = in.readLine()) != null) {
                scale.weigh(line);
                printer.print(line);
            }
        }
        System.out.println("done");
    }
}
