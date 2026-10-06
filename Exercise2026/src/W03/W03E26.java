package W03;

// Try it answer for video #18 (try it yourself first): a traffic light with a switch expression and a default.
public class W03E26 {
    public static void main(String[] args) {
        char light = 'Y';
        String action = switch (light) {
            case 'R' -> "Stop";
            case 'Y' -> "Slow down";
            case 'G' -> "Go";
            default -> "Unknown light";
        };
        System.out.println(light + ": " + action);
    }
}
