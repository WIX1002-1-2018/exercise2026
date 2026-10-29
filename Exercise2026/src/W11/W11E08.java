package W11;

import java.util.Locale;

// Overriding vs overloading.
// Overriding: the SAME parameter list in a subclass (fee() replaces the parent's fee()).
// Overloading: a DIFFERENT parameter list, in the same class or a subclass
// (fee(boolean) is a new method).
class ParcelE08 {
    final double weightKg;

    ParcelE08(double weightKg) {
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }
}

class ExpressParcelE08 extends ParcelE08 {
    ExpressParcelE08(double weightKg) {
        super(weightKg);
    }

    @Override
    double fee() {                                  // overrides: same name, no parameters
        return super.fee() + 8.00;
    }

    double fee(boolean insured) {                   // overloads: new parameter list
        return insured ? fee() + 3.00 : fee();
    }
}

public class W11E08 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        ParcelE08 p = new ParcelE08(1.2);
        ExpressParcelE08 e = new ExpressParcelE08(1.2);
        System.out.println("p.fee():          " + rm(p.fee()));
        System.out.println("e.fee():          " + rm(e.fee()));
        System.out.println("e.fee(true):      " + rm(e.fee(true)));
        System.out.println("e.fee(false):     " + rm(e.fee(false)));
        // Try it: put @Override above fee(boolean insured). Why does it not compile?
    }
}
