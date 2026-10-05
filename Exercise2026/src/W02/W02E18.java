package W02;

import java.util.Scanner;

// The nextLine trap: run it with 19 and a name. Why is the name empty? (Fixed in W02E19.)
public class W02E18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.println("[" + name + "] is " + age);
    }
}
