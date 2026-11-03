package W11;

// A public parent class in its own file, so the package W11.depot can extend it (W11E14).
// protected allows access throughout W11 and inside subclasses in other packages.
// Across packages, a receiver must have that subclass type or a subtype; W11E14 uses this.
// no access word (package-private): this class and the package W11 only.
public class W11Parcel {
    private final String trackingNo;
    protected double weightKg;

    public W11Parcel(String trackingNo, double weightKg) {
        this.trackingNo = trackingNo;
        this.weightKg = weightKg;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    String auditNote() {                            // package-private: W11 only
        return "audit " + trackingNo + ": " + weightKg + " kg";
    }
}
