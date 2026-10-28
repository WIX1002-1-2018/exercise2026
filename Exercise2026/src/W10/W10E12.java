package W10;

import java.util.Locale;

// static constants and static methods.
// static final = a constant shared by the class; constant names are written in UPPER_CASE.
// A static method needs no object, like Math.max: call it on the class name.
// A static method has no object of its own (no this), so it can use an instance field only through an object.
class RatesE12 {
    static final double BASE_FEE = 5.00;
    static final double RATE_PER_KG = 2.00;

    static double gramsToKg(int grams) {
        return grams / 1000.0;
    }

    static double feeFor(double kg) {
        return BASE_FEE + RATE_PER_KG * kg;
    }
}

public class W10E12 {
    public static void main(String[] args) {
        double kg = RatesE12.gramsToKg(850);
        System.out.println("850 g = " + kg + " kg");
        System.out.println("Fee: RM " + String.format(Locale.ROOT, "%.2f", RatesE12.feeFor(kg)));
        System.out.println("Base fee: RM " + String.format(Locale.ROOT, "%.2f", RatesE12.BASE_FEE));
        System.out.println("Heavier of 1.2 and 3.5: " + Math.max(1.2, 3.5) + " kg (Math.max is static too)");
        // Try it: add an instance field  double weightKg;  to RatesE12 and use weightKg alone in feeFor.
        // Read the compiler message: a static method has no this, so it needs an object for that field.
    }
}
