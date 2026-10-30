package W12;

import java.util.Comparator;

// Deck exercise: a common mistake in a Comparator (or compareTo).
// (int) (a.weightKg - b.weightKg) turns 1.2 - 1.5 = -0.3 into 0, so 1.2 kg and 1.5 kg count as "equal".
// Double.compare gives the right sign. Never compare by subtraction.
class ParcelE22 {
    final String trackingNo;
    final double weightKg;

    ParcelE22(String trackingNo, double weightKg) {
        this.trackingNo = trackingNo;
        this.weightKg = weightKg;
    }
}

public class W12E22 {
    public static void main(String[] args) {
        ParcelE22 a = new ParcelE22("MY30046", 1.2);
        ParcelE22 b = new ParcelE22("MY30047", 1.5);
        Comparator<ParcelE22> wrong = (x, y) -> (int) (x.weightKg - y.weightKg);
        Comparator<ParcelE22> right = (x, y) -> Double.compare(x.weightKg, y.weightKg);
        System.out.println("wrong: " + wrong.compare(a, b));
        System.out.println("right: " + right.compare(a, b));
    }
}
