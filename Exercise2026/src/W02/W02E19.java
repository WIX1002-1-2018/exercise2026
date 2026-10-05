package W02;

import java.util.Scanner;

// The nextLine trap, fixed: discard the rest of the line after nextInt().
public class W02E19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age: ");
        int age = in.nextInt();
        in.nextLine();                 // discard the rest of this line
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.println("[" + name + "] is " + age);
    }
}
