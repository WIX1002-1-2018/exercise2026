package W13;

// Try it answer for video #64 (try it yourself first): a shopping list holds text and one number.
// The try-catch is inside the loop, so only the item that is not text is skipped.
public class W13E25 {
    public static void main(String[] args) {
        Object[] items = {"kopi", 3, "teh"};
        for (int i = 0; i < items.length; i++) {
            try {
                String s = (String) items[i];
                System.out.println(s.toUpperCase());
            } catch (ClassCastException e) {
                System.out.println("item " + (i + 1) + ": not text");
            }
        }
        System.out.println("list done");
    }
}
