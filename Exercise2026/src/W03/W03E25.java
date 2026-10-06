package W03;

import java.util.Scanner;

// Try it answer for video #17 (try it yourself first): check a voucher code, ignoring upper and lower case.
public class W03E25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Voucher code: ");
        String code = in.next();
        if (code.equalsIgnoreCase("CSNET26")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
