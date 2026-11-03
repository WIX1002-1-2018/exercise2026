package W13;

// Several catch blocks: Java runs the first one whose type matches, and skips the rest.
// When the types overlap, put the specific ones first and the general Exception last.
// Each record is {total kg, number of boxes}; the weight per box uses int division.
public class W13E06 {
    static void perBox(String[] record) {
        try {
            if (record.length != 2) {
                throw new IllegalArgumentException("expected 2 fields, got " + record.length);
            }
            int kg = Integer.parseInt(record[0]);
            int boxes = Integer.parseInt(record[1]);
            System.out.println(kg + " kg in " + boxes + " boxes: " + (kg / boxes) + " kg each");
        } catch (NumberFormatException e) {
            System.out.println("not a number: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("no boxes: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("bad record: " + e.getMessage());
        }
        // Try it: move the catch (Exception e) block to the top, then read the compiler message.
    }

    public static void main(String[] args) {
        String[][] records = {{"12", "3"}, {"x", "3"}, {"12", "0"}, {"12"}};
        for (String[] r : records) {
            perBox(r);
        }
    }
}
