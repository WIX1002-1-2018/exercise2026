package W12;

import java.util.Arrays;
import java.util.Objects;

// Comparable gives a class its natural order, used by Arrays.sort.
// Week 11 rule: two parcels are equal when their tracking numbers are equal,
// so the natural order is by tracking number too (consistent with equals).
// compareTo returns a negative number, zero or a positive number.
class ParcelE12 implements Comparable<ParcelE12> {
    final String trackingNo;
    final double weightKg;

    ParcelE12(String trackingNo, double weightKg) {
        this.trackingNo = Objects.requireNonNull(trackingNo);
        this.weightKg = weightKg;
    }

    @Override
    public int compareTo(ParcelE12 other) {
        return trackingNo.compareTo(other.trackingNo);
    }

    @Override
    public final boolean equals(Object o) {          // Week 11 rule: same tracking number, same parcel
        return o instanceof ParcelE12 other && trackingNo.equals(other.trackingNo);
    }

    @Override
    public final int hashCode() {
        return trackingNo.hashCode();
    }

    @Override
    public String toString() {
        return trackingNo + " (" + weightKg + " kg)";
    }
}

public class W12E12 {
    public static void main(String[] args) {
        ParcelE12[] route = {
            new ParcelE12("MY30026", 2.0),
            new ParcelE12("MY30024", 0.5),
            new ParcelE12("MY30025", 1.2)
        };
        ParcelE12 a = route[0], b = route[1];
        System.out.println(a.trackingNo + " compareTo " + b.trackingNo + ": " + a.compareTo(b));
        Arrays.sort(route);
        System.out.println(Arrays.toString(route));

        ParcelE12 again = new ParcelE12("MY30024", 0.7);   // same tracking number, new weight reading
        System.out.println("compareTo: " + route[0].compareTo(again) + ", equals: " + route[0].equals(again));
    }
}
