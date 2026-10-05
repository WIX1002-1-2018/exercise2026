package W02;

import java.util.Scanner;

// Scanner in four steps: import, create, prompt, read.
public class W02E16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("The number is " + num);
    }
}
