package W12;

import java.util.Locale;

// An abstract class is a general category: it cannot be created with new.
// DeliveryItemE07 says every delivery item has a fee(), but only the concrete
// service types (standard parcel, express parcel, document) know how to compute it.
abstract class DeliveryItemE07 {
    final String trackingNo;

    DeliveryItemE07(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    abstract double fee();                          // no body: every concrete subclass must provide or inherit one
}

class StandardParcelE07 extends DeliveryItemE07 {
    final double weightKg;

    StandardParcelE07(String trackingNo, double weightKg) {
        super(trackingNo);
        this.weightKg = weightKg;
    }

    @Override
    double fee() {
        return 6.00 + 2.00 * weightKg;
    }
}

class ExpressParcelE07 extends StandardParcelE07 {
    ExpressParcelE07(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 8.00;
    }
}

class DocumentE07 extends DeliveryItemE07 {
    DocumentE07(String trackingNo) {
        super(trackingNo);
    }

    @Override
    double fee() {
        return 5.00;                                // flat fee, no weight
    }
}

public class W12E07 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        DeliveryItemE07[] items = {
            new StandardParcelE07("MY30014", 1.0),
            new ExpressParcelE07("MY30015", 1.0),
            new DocumentE07("MY30016")
        };
        for (DeliveryItemE07 d : items) {
            System.out.println(d.trackingNo + ": " + rm(d.fee()));
        }
        // Try it: add this line, then read the compiler message:
        // DeliveryItemE07 d = new DeliveryItemE07("MY30017");
    }
}
