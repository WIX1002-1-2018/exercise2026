package W02;

import java.util.Scanner;

// next() reads one word (token); nextLine() reads the rest of the line.
public class W02E17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your full name: ");
        String first = in.next();
        String rest = in.nextLine();
        System.out.println("next()     : [" + first + "]");
        System.out.println("nextLine() : [" + rest + "]");
    }
}
