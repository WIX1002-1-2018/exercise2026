package W04;

// for puts the start, the condition and the update in one line: for (start; condition; update).
// Order: start once; then test, body, update; test, body, update; ... until the test is false.
public class W04E10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Step " + i);
        }
        // System.out.println(i);   // Try it: remove the first //, read the message, then put it back.
        // VS Code: i cannot be resolved to a variable. NetBeans (javac): cannot find symbol. i exists only inside the loop.

        int k;                       // declared before the loop, so it can be used after it
        for (k = 10; k <= 50; k += 10) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("k after the loop = " + k);
    }
}
