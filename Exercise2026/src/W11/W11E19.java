package W11;

import java.util.Locale;

// is-a or has-a? (guided exercise)
// is-a (inheritance): an ExpressParcelE19 IS A ParcelE19, so it extends ParcelE19.
// has-a (a field): a RouteE19 HAS parcels, so it keeps them in an array; a route is not a parcel.
class ParcelE19 {
    final String recipient;
    final double weightKg;

    ParcelE19(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }
}

class ExpressParcelE19 extends ParcelE19 {          // is-a
    ExpressParcelE19(String recipient, double weightKg) {
        super(recipient, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 8.00;
    }
}

class RouteE19 {                                    // has-a
    final String driver;
    final ParcelE19[] parcels;

    RouteE19(String driver, ParcelE19[] parcels) {
        this.driver = driver;
        this.parcels = parcels;
    }

    double totalWeight() {
        double total = 0;
        for (ParcelE19 p : parcels) {
            total += p.weightKg;
        }
        return total;
    }
}

public class W11E19 {
    public static void main(String[] args) {
        ParcelE19 a = new ParcelE19("Aisyah", 1.2);
        ExpressParcelE19 b = new ExpressParcelE19("Ben", 0.4);
        RouteE19 r = new RouteE19("Farid", new ParcelE19[] {a});
        System.out.println("Express fee: RM " + String.format(Locale.ROOT, "%.2f", b.fee()));
        System.out.println(r.driver + " carries " + r.parcels.length
                + " parcel, " + r.totalWeight() + " kg");
        // Try it: a van has a driver and parcels; a refrigerated van is a van. Which uses extends?
    }
}
