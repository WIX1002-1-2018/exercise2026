package W13;

import java.util.List;

// Deck exercise: exception or if?
// Use an explicit bounds check for an index that can be invalid in normal use.
// stop is a zero-based index, so it must be at least 0 and less than route.size().
public class W13E17 {
    public static void main(String[] args) {
        List<String> route = List.of("MY30062", "MY30063");
        int stop = 2;
        if (stop >= 0 && stop < route.size()) {
            System.out.println("stop " + stop + ": " + route.get(stop));
        } else {
            System.out.println("stop " + stop + " is not on this route (" + route.size() + " stops)");
        }
    }
}
