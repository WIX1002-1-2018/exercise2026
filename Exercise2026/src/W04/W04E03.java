package W04;

// Counter-controlled loop: the number of passes is known before the loop starts (here 10).
public class W04E03 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.println("7 x " + n + " = " + (7 * n));
            n++;
        }
    }
}
