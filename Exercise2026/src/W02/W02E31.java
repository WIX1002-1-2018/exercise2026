package W02;

import java.util.Scanner;

// Never trust input: try abc (crash) and 150 (out of range) as the mark.
public class W02E31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mark (0 to 100): ");
        int mark = in.nextInt();             // abc: InputMismatchException
        System.out.println("mark = " + mark);
        int clamped = Math.clamp(mark, 0, 100);
        System.out.println("clamped = " + clamped + " (hides the bad mark)");
    }
}
