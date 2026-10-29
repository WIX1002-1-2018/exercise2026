package W11;

// Good to know (Java 17): a sealed class lists the classes that may extend it directly.
// Each permitted subclass must say final (no more subclasses),
// sealed (its own list) or non-sealed (open again).
// Only ExpressParcelE16 and FragileParcelE16 may extend ParcelE16 directly.
// FragileParcelE16 is non-sealed, so further subclasses are allowed through it.
sealed class ParcelE16 permits ExpressParcelE16, FragileParcelE16 {
    final String trackingNo;

    ParcelE16(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    String kind() {
        return "parcel";
    }
}

final class ExpressParcelE16 extends ParcelE16 {
    ExpressParcelE16(String trackingNo) {
        super(trackingNo);
    }

    @Override
    String kind() {
        return "express";
    }
}

non-sealed class FragileParcelE16 extends ParcelE16 {
    FragileParcelE16(String trackingNo) {
        super(trackingNo);
    }

    @Override
    String kind() {
        return "fragile";
    }
}

public class W11E16 {
    public static void main(String[] args) {
        System.out.println(new ParcelE16("MY20001").kind());
        System.out.println(new ExpressParcelE16("MY20002").kind());
        System.out.println(new FragileParcelE16("MY20003").kind());
        // Try it: add this after the last closing brace, then read the compiler message:
        // final class DroneParcelE16 extends ParcelE16 {
        //     DroneParcelE16() { super("MY20004"); }
        // }
    }
}
