package W13;

// Multi-catch (Java 7): one handler for two unrelated exception types, separated by |.
// The two types must not be parent and child.
public class W13E07 {
    static void perBox(String kgText, String boxesText) {
        try {
            int kg = Integer.parseInt(kgText);
            int boxes = Integer.parseInt(boxesText);
            System.out.println(kg / boxes + " kg each");
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("cannot split: " + e.getClass().getSimpleName());
        }
        // Try it: change ArithmeticException to IllegalArgumentException, then read the compiler message.
    }

    public static void main(String[] args) {
        perBox("12", "3");
        perBox("x", "3");
        perBox("12", "0");
    }
}
