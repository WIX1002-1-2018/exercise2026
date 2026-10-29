package W11;

// Mistake (guided exercise): a field declared AGAIN in the subclass hides the parent's field.
// ShadowParcelE20 has two weightKg fields: the parent's (1.2) and its own (never set, so 0.0).
// The parent's describe() reads the parent's field; the subclass's method reads its own.
class ParcelE20 {
    double weightKg;

    ParcelE20(double weightKg) {
        this.weightKg = weightKg;
    }

    String describe() {
        return "parent sees " + weightKg + " kg";
    }
}

class ShadowParcelE20 extends ParcelE20 {
    double weightKg;                                // MISTAKE: hides ParcelE20's weightKg

    ShadowParcelE20(double weightKg) {
        super(weightKg);
    }

    String label() {
        return "child sees " + weightKg + " kg";
    }
}

public class W11E20 {
    public static void main(String[] args) {
        ShadowParcelE20 s = new ShadowParcelE20(1.2);
        System.out.println(s.describe());
        System.out.println(s.label());
        // Fix: delete the second weightKg field. Then run again.
        // Course convention: put super(...) or this(...) first.
        // Java 25 permits some statements before it, but not a method call on this object.
        // Try it: in ShadowParcelE20's constructor, insert  label();  before  super(weightKg);
    }
}
