package W11;

// The fix for W11E17: the method name is toString (capital S),
// and @Override makes the compiler check it.
// With @Override, the AI agent's spelling mistake would not have compiled.
// Lesson: read AI code, run it, compare the output with what you expect, and use @Override.
class ParcelE18 {
    final String trackingNo;
    final String recipient;

    ParcelE18(String trackingNo, String recipient) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return trackingNo + " to " + recipient;
    }
}

class ExpressParcelE18 extends ParcelE18 {
    final int promisedHours;

    ExpressParcelE18(String trackingNo, String recipient, int promisedHours) {
        super(trackingNo, recipient);
        this.promisedHours = promisedHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", express in " + promisedHours + " h";
    }
}

public class W11E18 {
    public static void main(String[] args) {
        ExpressParcelE18 e = new ExpressParcelE18("MY20002", "Ben", 24);
        System.out.println(e);
        System.out.println("Expected: MY20002 to Ben, express in 24 h");
        // Try it: in W11E17, put @Override above tostring() and read the compiler message.
    }
}
