package W02;

import java.util.Random;

// Random numbers: roll a die (1 to 6) and pick a number from 0 to 99.
public class W02E23 {
    public static void main(String[] args) {
        Random r = new Random();
        final int MAX = 100;
        int die = r.nextInt(1, 7);       // 1 to 6 (Java 17+)
        int pick = r.nextInt(MAX);       // 0 to 99
        System.out.println("Die: " + die);
        System.out.println("Pick: " + pick);
    }
}
