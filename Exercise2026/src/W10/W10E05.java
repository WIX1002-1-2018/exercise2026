package W10;

// Constructors: a constructor runs once, when new makes the object, and sets its starting values.
// Fields always start with default values (0 for numbers, false, null for objects) before the constructor runs.
// If a class has no constructor at all, Java adds an empty one with no parameters.
// (Local variables in a method get no default: they must be given a value before use.)
// In the constructor, this.weightKg is the field and weightKg is the parameter.
class EmptyParcelE05 {                          // no constructor written: Java adds an empty one
    String recipient;
    double weightKg;
    boolean delivered;
}

class ParcelE05 {
    String recipient;
    double weightKg;
    boolean delivered;

    ParcelE05(String recipient, double weightKg) {   // same name as the class, no return type
        this.recipient = recipient;
        this.weightKg = weightKg;
        // delivered is not set here, so it keeps its default value, false
    }
}

public class W10E05 {
    public static void main(String[] args) {
        EmptyParcelE05 e = new EmptyParcelE05();
        System.out.println("Defaults: " + e.recipient + ", " + e.weightKg + ", " + e.delivered);

        ParcelE05 p = new ParcelE05("Aisyah", 1.2);
        System.out.println("Constructor: " + p.recipient + ", " + p.weightKg + ", " + p.delivered);
        // Try it: new ParcelE05() with no arguments does not compile now. Why?
    }
}
