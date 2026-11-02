package W13;

// A custom checked exception: extends Exception, so callers must catch it or declare it.
// This API makes overweight a checked exception on purpose: every caller must decide what to do
// (here, send the parcel by freight).
class OverweightParcelExceptionE12 extends Exception {
    private static final long serialVersionUID = 1L;

    OverweightParcelExceptionE12(String message) {
        super(message);
    }
}

public class W13E12 {
    static final double LIMIT_KG = 30.0;

    static void accept(String trackingNo, double weightKg) throws OverweightParcelExceptionE12 {
        if (!(Double.isFinite(weightKg) && weightKg > 0)) {
            throw new IllegalArgumentException(
                    "weight must be finite and greater than 0 kg: " + weightKg);
        }
        if (weightKg > LIMIT_KG) {
            throw new OverweightParcelExceptionE12(
                    trackingNo + " is " + weightKg + " kg, over the " + LIMIT_KG + " kg limit");
        }
        System.out.println(trackingNo + " accepted (" + weightKg + " kg)");
    }

    public static void main(String[] args) {
        try {
            accept("MY30057", 12.0);
            accept("MY30058", 31.5);
            accept("MY30059", 5.0);                            // not reached
        } catch (OverweightParcelExceptionE12 e) {
            System.out.println("send by freight: " + e.getMessage());
        }
        // Try it: delete the try { and the whole catch block, keep the three calls,
        // then read the compiler message.
    }
}
