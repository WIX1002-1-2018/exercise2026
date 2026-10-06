package W03;

// Multi-way if-else: else if adds more choices; the last else catches everything left.
public class W03E07 {
    public static void main(String[] args) {
        int speed = 110, limit = 110;
        if (speed > limit) {
            System.out.println("Over the limit");
        } else if (speed == limit) {
            System.out.println("At the limit");
        } else {
            System.out.println("Under the limit");
        }
    }
}
