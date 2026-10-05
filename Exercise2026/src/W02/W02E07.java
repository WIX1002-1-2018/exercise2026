package W02;

// Arithmetic operators, integer division and the remainder operator %.
public class W02E07 {
    public static void main(String[] args) {
        System.out.println(7 + 2);
        System.out.println(7 - 2);
        System.out.println(7 * 2);
        System.out.println(7 / 2);       // int / int drops the decimal part
        System.out.println(7.0 / 2);     // one side is a double
        System.out.println(7 % 2);       // remainder
        System.out.println(20 % 6);
        System.out.println(10 % 2 == 0); // even?
        System.out.println(7 % 2 == 0);
    }
}
