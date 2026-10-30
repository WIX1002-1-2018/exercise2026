package W12;

import java.util.Locale;

// Polymorphism: a ParcelE01 variable can refer to any kind of parcel.
// The variable's type stays ParcelE01; the object it refers to can change.
// p.fee() runs the version of the object, not the version of the variable's type.
class ParcelE01 {
    final String trackingNo;
    final double weightKg;

    ParcelE01(String trackingNo, double weightKg) {
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

class ExpressParcelE01 extends ParcelE01 {
    ExpressParcelE01(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 8.00;                  // express surcharge
    }

    @Override
    String kind() {
        return "express";
    }
}

public class W12E01 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        ParcelE01 p = new ParcelE01("MY30001", 1.2);
        System.out.println(p.trackingNo + " " + p.kind() + ": " + rm(p.fee()));

        p = new ExpressParcelE01("MY30002", 1.2);     // same variable, an express parcel now
        System.out.println(p.trackingNo + " " + p.kind() + ": " + rm(p.fee()));
    }
}
