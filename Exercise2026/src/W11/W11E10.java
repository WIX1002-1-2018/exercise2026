package W11;

// The Object class: every class except Object itself extends Object, directly or indirectly.
// ParcelE10 has no extends, so its parent is Object;
// it inherits getClass(), toString(), equals() and hashCode().
// getClass() (final: no class can override it) gives the exact class of the object.
// instanceof is true for the named class AND its subclasses; null instanceof anything is false.
class ParcelE10 {
    final String trackingNo;

    ParcelE10(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class ExpressParcelE10 extends ParcelE10 {
    ExpressParcelE10(String trackingNo) {
        super(trackingNo);
    }
}

public class W11E10 {
    public static void main(String[] args) {
        ParcelE10 p = new ParcelE10("MY20001");
        ExpressParcelE10 e = new ExpressParcelE10("MY20002");
        ParcelE10 none = null;

        System.out.println("p: " + p.getClass().getSimpleName()
                + ", e: " + e.getClass().getSimpleName());
        System.out.println("parent of ParcelE10: "
                + ParcelE10.class.getSuperclass().getSimpleName());
        System.out.println("same class (getClass ==): " + (p.getClass() == e.getClass()));
        System.out.println("e instanceof ParcelE10:   " + (e instanceof ParcelE10));
        System.out.println("p instanceof ExpressParcelE10: " + (p instanceof ExpressParcelE10));
        System.out.println("none instanceof ParcelE10: " + (none instanceof ParcelE10));
        // Try it: print ExpressParcelE10.class.getSuperclass().getSimpleName(). What do you expect?
    }
}
