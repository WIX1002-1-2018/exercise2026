package W12;

// Interface rules:
// status() has no body, so it is public and abstract; the class must implement it as public.
// A default method (Java 8) has a body: ParcelE11 inherits banner() here and could override it.
interface TrackableE11 {
    String status();

    default String banner() {
        return "[TRACK] " + status();
    }
}

class ParcelE11 implements TrackableE11 {
    final String trackingNo;

    ParcelE11(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    @Override
    public String status() {                        // Try it: remove public, then read the compiler message
        return trackingNo + " out for delivery";
    }
}

public class W12E11 {
    public static void main(String[] args) {
        ParcelE11 p = new ParcelE11("MY30023");
        System.out.println(p.status());
        System.out.println(p.banner());
    }
}
