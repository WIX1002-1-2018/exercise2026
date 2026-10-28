package W10;

// Constructor overloading: several constructors with different parameter lists.
// this(...) calls another constructor of the same class (we always put it first).
// A copy constructor makes a NEW object with the same values; b = a only copies the reference.
class ParcelE06 {
    String recipient;
    double weightKg;
    boolean delivered;

    ParcelE06() {                                   // no-argument constructor: a default parcel
        this("unknown", 0.5);
    }

    ParcelE06(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    ParcelE06(ParcelE06 other) {                    // copy constructor (pass a real parcel, not null)
        this(other.recipient, other.weightKg);
        this.delivered = other.delivered;
    }

    String describe() {
        return recipient + ", " + weightKg + " kg";
    }
}

public class W10E06 {
    public static void main(String[] args) {
        ParcelE06 d = new ParcelE06();
        System.out.println("Default: " + d.describe());

        ParcelE06 a = new ParcelE06("Aisyah", 1.2);
        ParcelE06 copy = new ParcelE06(a);          // a separate object
        ParcelE06 alias = a;                        // the same object

        alias.weightKg = 2.0;
        System.out.println("a:     " + a.describe());
        System.out.println("copy:  " + copy.describe());
        System.out.println("alias == a: " + (alias == a) + ", copy == a: " + (copy == a));
    }
}
