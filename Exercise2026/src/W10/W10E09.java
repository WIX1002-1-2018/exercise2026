package W10;

// toString and equals.
// println(p) calls p.toString(); without our own toString, Java prints the class name and a hash code.
// == asks "the same object?"; equals is the method we write to ask "the same parcel?".
// (This equals takes a ParcelE09, so it is an overload used when we call it ourselves. The standard
// equals(Object), with @Override and hashCode, comes with inheritance in Week 11.)
class PlainParcelE09 {
    String trackingNo = "MY10001";
}

class ParcelE09 {
    private final String trackingNo;
    private final String recipient;
    private final double weightKg;

    ParcelE09(String trackingNo, String recipient, double weightKg) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    public String toString() {                      // public, like the toString every object already has
        return trackingNo + " to " + recipient + ", " + weightKg + " kg";
    }

    public boolean equals(ParcelE09 other) {        // same parcel = same tracking number
        return other != null && trackingNo.equals(other.trackingNo);
    }
}

public class W10E09 {
    public static void main(String[] args) {
        System.out.println(new PlainParcelE09());   // no toString: class name, @ and a hash code (it may change)

        ParcelE09 a = new ParcelE09("MY10001", "Aisyah", 1.2);
        ParcelE09 b = new ParcelE09("MY10001", "Aisyah", 1.2);
        ParcelE09 c = new ParcelE09("MY10002", "Ben", 0.4);

        System.out.println(a);                      // our toString
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(c): " + a.equals(c));
    }
}
