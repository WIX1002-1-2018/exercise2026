package W12;

// Three special cases of the run-time choice (deck):
// 1. A private method is not inherited. A subclass method with the same signature is a new method,
//    and the parent's own code still calls its private one.
// 2. A static method belongs to the class. A subclass static method with the same signature hides it;
//    call static methods with the class name.
// 3. A final method cannot be overridden by any subclass (a final method may itself override
//    an inherited one; it only stops further overriding).
class ParcelE04 {
    private String label() {
        return "parcel";
    }

    String describe() {
        return "describe() says: " + label();       // calls ParcelE04's private label()
    }

    static String rules() {
        return "standard rules";
    }

    final String company() {
        return "UM Parcel";
    }
}

class ExpressParcelE04 extends ParcelE04 {
    String label() {                                // a new method, not an override
        return "express";
    }

    static String rules() {                         // hides ParcelE04.rules()
        return "express rules";
    }
}

public class W12E04 {
    public static void main(String[] args) {
        ExpressParcelE04 e = new ExpressParcelE04();
        System.out.println(e.describe());
        System.out.println("label() says: " + e.label());
        System.out.println(ParcelE04.rules() + " / " + ExpressParcelE04.rules());
        System.out.println(e.company());
        // Try it: add @Override above label() in ExpressParcelE04, then read the compiler message.
        // Try it: add String company() { return "Other"; } to ExpressParcelE04.
    }
}
