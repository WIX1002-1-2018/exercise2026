package W04;

// Try it answer for video #20 (try it yourself first): a plant is 4 cm tall and grows 3 cm a week.
// Print its height after each week until it is taller than 20 cm, then the number of weeks.
public class W04E20 {
    public static void main(String[] args) {
        int height = 4;
        int weeks = 0;
        while (height <= 20) {
            height = height + 3;
            weeks++;
            System.out.println("Week " + weeks + ": " + height + " cm");
        }
        System.out.println("Taller than 20 cm after " + weeks + " weeks");
    }
}
