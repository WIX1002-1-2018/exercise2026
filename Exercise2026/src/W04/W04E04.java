package W04;

// Condition-controlled loop: the number of passes is not known in advance.
// The loop stops when the savings reach the target: how many years does that take at 5% a year?
public class W04E04 {
    public static void main(String[] args) {
        double balance = 1000.0;
        int years = 0;
        while (balance < 1500.0) {
            balance = balance * 1.05;
            years++;
        }
        System.out.printf("After %d years: RM %.2f%n", years, balance);
    }
}
