package W02;

// Find the bug: the average of 70, 85 and 90 should be about 81.67.
public class W02E28 {
    public static void main(String[] args) {
        int m1 = 70, m2 = 85, m3 = 90;
        double average = (m1 + m2 + m3) / 3;
        System.out.println("Average: " + average);
    }
}
