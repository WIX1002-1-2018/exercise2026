package W12;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

// ArrayList<ParcelE13> is a list that grows: add, get (index from 0), size().
// It holds every kind of parcel; get() gives a ParcelE13 reference,
// and the overridden fee() still runs the object's own version.
// list.sort(null) sorts by the natural order (compareTo).
class ParcelE13 implements Comparable<ParcelE13> {
    final String trackingNo;
    final double weightKg;

    ParcelE13(String trackingNo, double weightKg) {
        this.trackingNo = Objects.requireNonNull(trackingNo);
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }

    @Override
    public int compareTo(ParcelE13 other) {
        return trackingNo.compareTo(other.trackingNo);
    }

    @Override
    public final boolean equals(Object o) {          // Week 11 rule: same tracking number, same parcel
        return o instanceof ParcelE13 other && trackingNo.equals(other.trackingNo);
    }

    @Override
    public final int hashCode() {
        return trackingNo.hashCode();
    }
}

class ExpressParcelE13 extends ParcelE13 {
    ExpressParcelE13(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 8.00;
    }
}

public class W12E13 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        ArrayList<ParcelE13> list = new ArrayList<>();
        list.add(new ParcelE13("MY30029", 1.0));
        list.add(new ExpressParcelE13("MY30027", 1.0));
        list.add(new ParcelE13("MY30028", 2.0));
        System.out.println("size: " + list.size());
        System.out.println("first: " + list.get(0).trackingNo);

        list.sort(null);                            // null: use compareTo
        for (ParcelE13 p : list) {
            System.out.println(p.trackingNo + ": " + rm(p.fee()));
        }

        // More (deck): replace and remove
        list.set(0, new ParcelE13("MY30030", 0.5));
        list.remove(1);
        System.out.println("after set and remove: " + list.size() + " parcels, first " + list.get(0).trackingNo);
    }
}
