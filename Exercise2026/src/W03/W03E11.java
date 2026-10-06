package W03;

import java.util.Scanner;

// Compare String contents with equals, not ==.
// compareTo gives lexicographic order (by UTF-16 code units): negative, zero or positive.
public class W03E11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type yes: ");
        String answer = in.nextLine();
        // == compares references: it is true only when both are the same object (for example, two identical
        // literals share one object). So == can look right in one test and fail in another: use equals for text.
        System.out.println(answer == "yes");
        System.out.println(answer.equals("yes"));             // compares the characters
        System.out.println("YES".equalsIgnoreCase(answer));   // ignores upper and lower case
        System.out.println("apple".compareTo("banana"));      // negative: apple comes first
        System.out.println("pear".compareTo("pear"));         // zero: same text
        System.out.println("Zebra".compareTo("apple"));       // negative: 'Z' (90) comes before 'a' (97)
        System.out.println("Zebra".compareToIgnoreCase("apple")); // positive: apple comes first
    }
}
