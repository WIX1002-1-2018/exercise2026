package W03;

import java.util.Scanner;

// Read one character with charAt(0), then decide with if-else.
public class W03E12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Save the file? (y/n): ");
        char choice = in.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Saved");
        } else if (choice == 'n' || choice == 'N') {
            System.out.println("Not saved");
        } else {
            System.out.println("Please answer y or n");
        }
    }
}
