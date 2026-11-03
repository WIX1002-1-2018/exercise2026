package W10;

// References: a variable of a class type holds a reference to an object, not the object itself.
// b = a copies the reference, so a and b are two names for ONE object.
// == compares references (the same object?), not the values inside.
class ParcelE04 {
    String recipient;
    double weightKg;
}

public class W10E04 {
    public static void main(String[] args) {
        ParcelE04 a = new ParcelE04();
        a.recipient = "Aisyah";
        a.weightKg = 1.2;

        ParcelE04 b = a;                        // no new: b refers to the same object as a
        b.weightKg = 2.0;                       // change it through b ...
        System.out.println("a.weightKg = " + a.weightKg);     // ... and a sees the change

        ParcelE04 c = new ParcelE04();          // a different object with the same values
        c.recipient = "Aisyah";
        c.weightKg = 2.0;
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));

        ParcelE04 d = null;                     // null: d refers to no object yet
        System.out.println("d is " + d);
        if (d == null) {
            System.out.println("d has no parcel, so d.weightKg would stop the program");
        }
        // Try it: add the line  d.weightKg = 1.0;  and run. Read the NullPointerException message.
    }
}
