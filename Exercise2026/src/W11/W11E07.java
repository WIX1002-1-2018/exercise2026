package W11;

import java.util.Locale;

// @Override asks the compiler to check that this method really overrides a parent method.
// Without it, a spelling mistake (fees instead of fee) makes a NEW method:
// the program still runs, but fee() keeps the parent's version and the surcharge is lost.
class ParcelE07 {
    final double weightKg;

    ParcelE07(double weightKg) {
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }
}

class ExpressParcelE07 extends ParcelE07 {
    ExpressParcelE07(double weightKg) {
        super(weightKg);
    }

    @Override
    double fee() {                                  // checked: ParcelE07 has fee()
        return super.fee() + 8.00;
    }
}

class SilentTypoParcelE07 extends ParcelE07 {       // no @Override: the typo goes unnoticed
    SilentTypoParcelE07(double weightKg) {
        super(weightKg);
    }

    double fees() {                                 // meant to be fee(): a new method instead
        return super.fee() + 8.00;
    }
}

public class W11E07 {
    public static void main(String[] args) {
        ExpressParcelE07 e = new ExpressParcelE07(1.2);
        SilentTypoParcelE07 t = new SilentTypoParcelE07(1.2);
        System.out.println("Express fee:     RM " + String.format(Locale.ROOT, "%.2f", e.fee()));
        System.out.println("Typo parcel fee: RM " + String.format(Locale.ROOT, "%.2f", t.fee()));
        // Try it: put @Override above fees() and read the compiler message.
    }
}
