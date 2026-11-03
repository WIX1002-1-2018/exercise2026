package W10;

// One public class per file: the file name must be the class name (W10Parcel.java).
// This is the usual layout. W10E10 uses this class from another file in the same package, W10.
public class W10Parcel {
    private final String trackingNo;
    private final String recipient;
    private final double weightKg;

    public W10Parcel(String trackingNo, String recipient, double weightKg) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double fee() {
        return 5.00 + 2.00 * weightKg;
    }

    public String toString() {
        return trackingNo + " to " + recipient + ", " + weightKg + " kg";
    }
}
