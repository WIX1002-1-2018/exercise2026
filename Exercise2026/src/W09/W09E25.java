package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// INTENTIONALLY FAULTY (for the AI agent check): it saves three names and reads them back,
// but it reads 0 names. Find the bug. (Fixed in W09E26.)
public class W09E25 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("team.txt");
        out.println("Aisyah");
        out.println("Ben");
        out.println("Chong");

        Scanner in = new Scanner(new File("team.txt"));
        int count = 0;
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
            count++;
        }
        in.close();
        out.close();
        System.out.println(count + " names read");
    }
}
