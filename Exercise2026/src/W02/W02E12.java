package W02;

// Convert before you divide; doubles store many decimals approximately.
public class W02E12 {
    public static void main(String[] args) {
        double a = 7 / 2;            // int division first
        double b = (double) 7 / 2;   // convert, then divide
        double c = (double) (7 / 2); // too late
        System.out.println(a + " " + b + " " + c);

        System.out.println(0.1 + 0.2);
        System.out.printf("%.2f%n", 0.1 + 0.2);
    }
}
