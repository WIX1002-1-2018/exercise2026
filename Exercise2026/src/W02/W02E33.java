package W02;

// W02E28 fixed: divide by 3.0 so the division is done in double, not int.
public class W02E33 {
    public static void main(String[] args) {
        int m1 = 70, m2 = 85, m3 = 90;
        double average = (m1 + m2 + m3) / 3.0;
        System.out.println("Average: " + average);
    }
}
