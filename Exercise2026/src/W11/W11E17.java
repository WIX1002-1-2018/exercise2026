package W11;

// INTENTIONALLY FAULTY (for the AI agent check): an AI agent wrote ExpressParcelE17.
// It compiles and runs, but println shows no express details. Find the bug. (Fixed in W11E18.)
class ParcelE17 {
    final String trackingNo;
    final String recipient;

    ParcelE17(String trackingNo, String recipient) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return trackingNo + " to " + recipient;
    }
}

class ExpressParcelE17 extends ParcelE17 {
    final int promisedHours;

    ExpressParcelE17(String trackingNo, String recipient, int promisedHours) {
        super(trackingNo, recipient);
        this.promisedHours = promisedHours;
    }

    public String tostring() {
        return super.toString() + ", express in " + promisedHours + " h";
    }
}

public class W11E17 {
    public static void main(String[] args) {
        ExpressParcelE17 e = new ExpressParcelE17("MY20002", "Ben", 24);
        System.out.println(e);
        System.out.println("Expected: MY20002 to Ben, express in 24 h");
    }
}
