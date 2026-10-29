package W11;

// final in three places:
// a final field gets its value once (the tracking number never changes),
// a final method cannot be overridden,
// and a final class cannot be extended (String is a final class).
class ParcelE15 {
    private final String trackingNo;                // final field: set once, in the constructor

    ParcelE15(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    final String getTrackingNo() {                  // final method: subclasses keep this version
        return trackingNo;
    }

    String kind() {
        return "parcel";
    }
}

final class LockedParcelE15 extends ParcelE15 {     // final class: no subclass of LockedParcelE15
    LockedParcelE15(String trackingNo) {
        super(trackingNo);
    }

    @Override
    String kind() {
        return "locked parcel";
    }
}

public class W11E15 {
    public static void main(String[] args) {
        LockedParcelE15 k = new LockedParcelE15("MY20001");
        System.out.println(k.getTrackingNo() + " is a " + k.kind());
        // Try it 1: inside LockedParcelE15, add:  String getTrackingNo() { return "TEST"; }
        // Restore the file before Try it 2.
        // Try it 2: after the last closing brace, add:  class MyStringE15 extends String { }
    }
}
