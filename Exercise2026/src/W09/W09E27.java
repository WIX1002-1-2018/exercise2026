package W09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Try it answer for video #41 (try it yourself first): write three to-do items to todo.txt,
// then open the file again in append mode and add a fourth. Open todo.txt in the editor to check it.
public class W09E27 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("todo.txt"));          // start a new list
        out.println("Watch video #41");
        out.println("Run W09E01 to W09E05");
        out.println("Push the lab answer");
        out.close();
        if (out.checkError()) {                         // PrintWriter does not throw; ask it (W09E02)
            System.out.println("Could not write todo.txt");
            return;
        }
        System.out.println("todo.txt written with 3 items");

        PrintWriter more = new PrintWriter(new FileOutputStream("todo.txt", true));   // append
        more.println("Prepare for Viva 2");
        more.close();
        if (more.checkError()) {
            System.out.println("Could not append to todo.txt");
            return;
        }
        System.out.println("1 more item appended: open todo.txt to check");
    }
}
