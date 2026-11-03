package W13;

// A custom unchecked exception: extends RuntimeException, so callers are not forced to catch it.
// This API treats malformed tracking text as an invalid argument and uses an unchecked exception;
// callers may still catch it, as main does here. Checked or unchecked is a design choice.
class InvalidTrackingNumberExceptionE13 extends RuntimeException {
    private static final long serialVersionUID = 1L;

    InvalidTrackingNumberExceptionE13(String message) {
        super(message);
    }
}

public class W13E13 {
    static String checkTracking(String t) {
        if (!t.matches("MY\\d{5}")) {
            throw new InvalidTrackingNumberExceptionE13("not MY + 5 digits: " + t);
        }
        return t;
    }

    public static void main(String[] args) {
        String[] codes = {"MY30061", "MY3006", "XX30061"};
        for (String c : codes) {
            try {
                System.out.println("ok: " + checkTracking(c));
            } catch (InvalidTrackingNumberExceptionE13 e) {
                System.out.println("rejected: " + e.getMessage());
            }
        }
    }
}
