package W12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

// Comparable (compareTo) is the natural order: here, by tracking number.
// A Comparator (compare(a, b)) is an extra order kept outside the class: here, by fee.
// First as an anonymous class (an unnamed class written where its object is created),
// then the same Comparator as a lambda.
class ParcelE17 implements Comparable<ParcelE17> {
    final String trackingNo;
    final double weightKg;

    ParcelE17(String trackingNo, double weightKg) {
        this.trackingNo = Objects.requireNonNull(trackingNo);
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }

    @Override
    public int compareTo(ParcelE17 other) {
        return trackingNo.compareTo(other.trackingNo);
    }

    @Override
    public final boolean equals(Object o) {          // Week 11 rule: same tracking number, same parcel
        return o instanceof ParcelE17 other && trackingNo.equals(other.trackingNo);
    }

    @Override
    public final int hashCode() {
        return trackingNo.hashCode();
    }

    @Override
    public String toString() {
        return trackingNo + " RM " + String.format(Locale.ROOT, "%.2f", fee());
    }
}

public class W12E17 {
    public static void main(String[] args) {
        ArrayList<ParcelE17> list = new ArrayList<>();
        list.add(new ParcelE17("MY30035", 2.5));
        list.add(new ParcelE17("MY30037", 0.5));
        list.add(new ParcelE17("MY30036", 1.0));

        list.sort(null);
        System.out.println("natural: " + list);

        Comparator<ParcelE17> byFee = new Comparator<ParcelE17>() {
            @Override
            public int compare(ParcelE17 a, ParcelE17 b) {
                return Double.compare(a.fee(), b.fee());
            }
        };
        list.sort(byFee);
        System.out.println("by fee:  " + list);

        list.sort(null);
        // Comparator has one abstract method (a functional interface), so a lambda can stand in for it.
        Comparator<ParcelE17> byFeeLambda = (a, b) -> Double.compare(a.fee(), b.fee());
        list.sort(byFeeLambda);
        System.out.println("lambda:  " + list);
    }
}
