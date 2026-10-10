package W04;

import java.util.Scanner;

// Try it answer for video #21 (try it yourself first): read words until the user types stop,
// then print how many words were typed. The sentinel is a String, so compare it with equals (Week 3).
// Try with: Java loop test stop   and with just stop.
public class W04E21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.print("Word (stop to finish): ");
        String word = in.next();
        while (!word.equals("stop")) {
            count++;
            System.out.print("Word (stop to finish): ");
            word = in.next();
        }
        System.out.println(count + " words");
        in.close();
    }
}
