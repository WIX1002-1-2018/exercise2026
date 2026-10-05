package W02;

// Casting: widening is automatic, narrowing needs (type) and cuts the decimals.
public class W02E11 {
    public static void main(String[] args) {
        double d = 5;                 // widening: int to double
        System.out.println(d);
        System.out.println((int) 3.9);        // narrowing cuts: 3
        System.out.println(Math.round(3.9));  // rounding: 4
        int a = 8, b = 3;
        System.out.println(a / b);
        System.out.println(a / (double) b);
    }
}
