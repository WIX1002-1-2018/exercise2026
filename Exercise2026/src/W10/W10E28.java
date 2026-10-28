package W10;

// Try it answer for video #49 (try it yourself first): a class TimeE28 with a static constant
// SECONDS_PER_MINUTE and two overloaded static methods toSeconds(minutes) and toSeconds(hours, minutes).
class TimeE28 {
    static final int SECONDS_PER_MINUTE = 60;

    static int toSeconds(int minutes) {
        return minutes * SECONDS_PER_MINUTE;
    }

    static int toSeconds(int hours, int minutes) {
        return toSeconds(hours * 60 + minutes);
    }
}

public class W10E28 {
    public static void main(String[] args) {
        System.out.println("45 minutes = " + TimeE28.toSeconds(45) + " s");
        System.out.println("1 h 30 min = " + TimeE28.toSeconds(1, 30) + " s");
    }
}
