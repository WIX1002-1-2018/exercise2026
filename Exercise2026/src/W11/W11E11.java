package W11;

// Object.toString() returns the class name, @, and a hash code in hexadecimal (W10E09).
// println prints the returned text; the hash code is not a memory address.
// ParcelE11 overrides it once; ExpressParcelE11 keeps the parent's text and adds its own part.
// In this design every subclass starts with super.toString(),
// so the parcel details are never lost.
class ParcelE11 {
    final String trackingNo;
    final String recipient;

    ParcelE11(String trackingNo, String recipient) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
    }

    @Override
    public String toString() {                      // public: Object's toString is public
        return trackingNo + " to " + recipient;
    }
}

class ExpressParcelE11 extends ParcelE11 {
    final int promisedHours;

    ExpressParcelE11(String trackingNo, String recipient, int promisedHours) {
        super(trackingNo, recipient);
        this.promisedHours = promisedHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", express in " + promisedHours + " h";
    }
}

public class W11E11 {
    public static void main(String[] args) {
        ParcelE11 p = new ParcelE11("MY20001", "Aisyah");
        ExpressParcelE11 e = new ExpressParcelE11("MY20002", "Ben", 24);
        System.out.println(p);                      // println calls toString()
        System.out.println(e);
        System.out.println("Label: " + e);          // + with a String calls toString() too
        // Try it: remove super.toString() + from ExpressParcelE11. What is lost?
    }
}
