package W10;

import java.util.Locale;

// Method overloading: the same method name with different parameter lists.
// Java picks the method by the number and the types of the arguments.
// The parameter lists must differ in number, types or order; a different return type alone is not enough.
// Careful: fee(1) has an int argument, so it calls the grams version: 1 gram, not 1 kg.
class FeeE13 {
    static double fee(double kg) {
        return 5.00 + 2.00 * kg;
    }

    static double fee(double kg, boolean express) {     // a different number of parameters
        if (express) {
            return fee(kg) + 8.00;
        }
        return fee(kg);
    }

    static double fee(int grams) {                      // a different type: int
        return fee(grams / 1000.0);
    }
}

public class W10E13 {
    public static void main(String[] args) {
        System.out.println("fee(1.2)       = RM " + String.format(Locale.ROOT, "%.2f", FeeE13.fee(1.2)));
        System.out.println("fee(1.2, true) = RM " + String.format(Locale.ROOT, "%.2f", FeeE13.fee(1.2, true)));
        System.out.println("fee(850)       = RM " + String.format(Locale.ROOT, "%.2f", FeeE13.fee(850)));
        System.out.println("fee(1)         = RM " + String.format(Locale.ROOT, "%.4f", FeeE13.fee(1)) + "  (1 gram!)");
        System.out.println("fee(1.0)       = RM " + String.format(Locale.ROOT, "%.2f", FeeE13.fee(1.0)) + "  (1 kg)");
    }
}
