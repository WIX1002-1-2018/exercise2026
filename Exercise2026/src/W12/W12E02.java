package W12;

import java.util.Locale;

// A polymorphic route: one ParcelE02[] array holds every kind of parcel.
// The loop calls p.fee() and p.kind(); each object answers with its own version.
// Adding a new kind of parcel later needs no change to the loop.
class ParcelE02 {
    final String trackingNo;
    final double weightKg;

    ParcelE02(String trackingNo, double weightKg) {
        this.trackingNo = trackingNo;
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }

    String kind() {
        return "parcel";
    }
}

class ExpressParcelE02 extends ParcelE02 {
    ExpressParcelE02(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 8.00;
    }

    @Override
    String kind() {
        return "express";
    }
}

class FragileParcelE02 extends ParcelE02 {
    FragileParcelE02(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 3.00;                  // insurance
    }

    @Override
    String kind() {
        return "fragile";
    }
}

class SameDayParcelE02 extends ExpressParcelE02 {
    SameDayParcelE02(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 5.00;                  // same-day on top of express
    }

    @Override
    String kind() {
        return "same-day";
    }
}

public class W12E02 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        ParcelE02[] route = {
            new ParcelE02("MY30003", 1.0),
            new ExpressParcelE02("MY30004", 2.5),
            new FragileParcelE02("MY30005", 0.5),
            new SameDayParcelE02("MY30006", 1.5)
        };
        double total = 0;
        for (ParcelE02 p : route) {
            System.out.println(p.trackingNo + "  " + p.kind() + ": " + rm(p.fee()));
            total += p.fee();
        }
        System.out.println("Route total: " + rm(total));
    }
}
