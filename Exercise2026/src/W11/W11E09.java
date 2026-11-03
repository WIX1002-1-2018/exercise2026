package W11;

// Override rules:
// 1. Same name and the same parameter list.
// 2. The access cannot be reduced (a public method stays public).
// 3. The return type is the same, or a subclass of it for a class type (covariant return).
// 4. A private method is not inherited, so it cannot be overridden:
//    a method with the same name in the subclass is a new method.
class ParcelE09 {
    final String trackingNo;

    ParcelE09(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public ParcelE09 self() {
        return this;
    }

    public String kind() {
        return "parcel";
    }

    private String secretCode() {                   // private: not inherited
        return "P-" + trackingNo;
    }

    String showCode() {
        return secretCode();
    }
}

class ExpressParcelE09 extends ParcelE09 {
    ExpressParcelE09(String trackingNo) {
        super(trackingNo);
    }

    @Override
    public ExpressParcelE09 self() {                // covariant: returns the subclass type
        return this;
    }

    @Override
    public String kind() {                          // stays public
        return "express parcel";
    }

    public String secretCode() {                    // a NEW method, not an override
        return "E-" + trackingNo;
    }
}

public class W11E09 {
    public static void main(String[] args) {
        ExpressParcelE09 e = new ExpressParcelE09("MY20001");
        ExpressParcelE09 same = e.self();           // no cast needed: self() returns ExpressParcelE09
        System.out.println(same.kind() + " " + same.trackingNo);
        System.out.println("secretCode(): " + e.secretCode());
        System.out.println("showCode():   " + e.showCode());   // the parent's private method runs
        // Try it 1: in ExpressParcelE09, change  public String kind()  to  String kind().
        // Try it 2: put @Override above secretCode() in ExpressParcelE09. Read both messages.
    }
}
