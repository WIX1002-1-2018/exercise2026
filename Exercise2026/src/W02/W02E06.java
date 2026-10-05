package W02;

// Constants with final: the value cannot be reassigned after it is set.
public class W02E06 {
    public static void main(String[] args) {
        final int MIN_MARK = 0;
        final int MAX_MARK = 100;
        final double SST_RATE = 0.08;   // example rate only

        System.out.println("Marks from " + MIN_MARK + " to " + MAX_MARK);
        System.out.println("Rate: " + SST_RATE);

        // Try it: remove the // below and compile. javac says:
        // cannot assign a value to final variable MAX_MARK
        // MAX_MARK = 120;
    }
}
