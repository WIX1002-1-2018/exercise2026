package W12;

// Good to know (Java 21, deck): a switch with type patterns.
// DeliveryE18 is abstract and sealed, so the compiler knows every possible kind.
// With no default, the switch must cover all three; the compiler checks this.
abstract sealed class DeliveryE18 permits StandardE18, ExpressE18, DocumentE18 {
    final String trackingNo;

    DeliveryE18(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

final class StandardE18 extends DeliveryE18 {
    StandardE18(String trackingNo) {
        super(trackingNo);
    }
}

final class ExpressE18 extends DeliveryE18 {
    final int promisedHours;

    ExpressE18(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }
}

final class DocumentE18 extends DeliveryE18 {
    DocumentE18(String trackingNo) {
        super(trackingNo);
    }
}

public class W12E18 {
    static String promise(DeliveryE18 d) {
        return switch (d) {
            case StandardE18 s -> s.trackingNo + ": 3 days";
            case ExpressE18 e -> e.trackingNo + ": " + e.promisedHours + " hours";
            case DocumentE18 doc -> doc.trackingNo + ": next day";
        };
        // Try it: delete the DocumentE18 case, then read the compiler message.
        // A null d would stop with NullPointerException unless a case null is added.
    }

    public static void main(String[] args) {
        DeliveryE18[] items = {
            new StandardE18("MY30038"),
            new ExpressE18("MY30039", 24),
            new DocumentE18("MY30040")
        };
        for (DeliveryE18 d : items) {
            System.out.println(promise(d));
        }
    }
}
