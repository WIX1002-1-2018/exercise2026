package W12;

import java.util.Locale;

// An abstract class can still have fields, a constructor and normal methods.
// Its constructor runs through super(...) when a subclass object is built.
// receipt() is a normal method that calls the abstract fee(): the subclass supplies it.
abstract class DeliveryItemE08 {
    final String trackingNo;

    DeliveryItemE08(String trackingNo) {
        this.trackingNo = trackingNo;
        System.out.println("DeliveryItemE08 part ready: " + trackingNo);
    }

    abstract double fee();

    String receipt() {
        return trackingNo + " costs RM " + String.format(Locale.ROOT, "%.2f", fee());
    }
}

class LetterE08 extends DeliveryItemE08 {
    LetterE08(String trackingNo) {
        super(trackingNo);
    }

    @Override
    double fee() {
        return 1.50;
    }
}

public class W12E08 {
    public static void main(String[] args) {
        LetterE08 l = new LetterE08("MY30018");
        System.out.println(l.receipt());
        // Try it: delete the fee() method in LetterE08 (with its @Override), then read the compiler message.
    }
}
