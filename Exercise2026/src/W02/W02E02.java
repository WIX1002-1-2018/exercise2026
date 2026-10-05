package W02;

// Assignment copies a value: changing x later does not change y.
public class W02E02 {
    public static void main(String[] args) {
        int x = 5;
        int y = x;     // y gets a copy of 5
        x = 8;         // only x changes
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
