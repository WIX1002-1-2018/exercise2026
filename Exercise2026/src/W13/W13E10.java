package W13;

// throw: a constructor can refuse bad data by throwing an exception object.
// IllegalArgumentException is unchecked, so callers may catch it but do not have to.
class ParcelE10 {
    final String trackingNo;
    final double weightKg;

    ParcelE10(String trackingNo, double weightKg) {
        if (!(Double.isFinite(weightKg) && weightKg > 0)) {
            throw new IllegalArgumentException("weight must be finite and greater than 0 kg: " + weightKg);
        }
        this.trackingNo = trackingNo;
        this.weightKg = weightKg;
    }
}

public class W13E10 {
    public static void main(String[] args) {
        double[] weights = {1.5, 0, -2, Double.NaN};
        for (double w : weights) {
            try {
                ParcelE10 p = new ParcelE10("MY30056", w);
                System.out.println("created: " + p.weightKg + " kg");
            } catch (IllegalArgumentException e) {
                System.out.println("refused: " + e.getMessage());
            }
        }
    }
}
