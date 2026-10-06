package W03;

import java.util.Random;

// A random number in a range, then a decision. nextInt(1, 101) gives 1 to 100 (Java 17+).
public class W03E17 {
    public static void main(String[] args) {
        Random r = new Random();
        int chance = r.nextInt(1, 101);
        System.out.println("chance = " + chance);
        if (chance <= 10) {
            System.out.println("Rare prize!");
        } else {
            System.out.println("Try again");
        }
    }
}
