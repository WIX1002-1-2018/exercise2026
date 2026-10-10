package W04;

// Try it answer for video #22 (try it yourself first): with a for loop, print every fourth year
// from 2028 to 2048, then how many years were printed.
public class W04E22 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 2028; year <= 2048; year += 4) {
            System.out.print(year + " ");
            count++;
        }
        System.out.println();
        System.out.println(count + " years");
    }
}
