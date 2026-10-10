package W04;

// while: repeat the body as long as the condition is true. Every loop has four parts:
// 1 start value, 2 condition (tested before every pass), 3 body, 4 update (moves towards the end).
public class W04E01 {
    public static void main(String[] args) {
        int lap = 1;                            // 1 start
        while (lap <= 5) {                      // 2 condition
            System.out.println("Lap " + lap);   // 3 body
            lap++;                              // 4 update
        }
        System.out.println("Done. lap is now " + lap);   // the value that made the condition false
    }
}
