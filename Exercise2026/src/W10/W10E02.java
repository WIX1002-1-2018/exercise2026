package W10;

// A first class: a class is a blueprint, an object is one thing made from it with new.
// Every object has its own copy of the fields, so the facts of one parcel stay together.
// (The class sits in this file, without public, so the example runs on its own; see W10E10 for one class per file.)
// No access word on a field (package-private): any class in the package W10 can use it.
class ParcelE02 {
    String recipient;
    double weightKg;
    boolean delivered;
}

public class W10E02 {
    public static void main(String[] args) {
        ParcelE02 a = new ParcelE02();      // new makes an object; a refers to it
        a.recipient = "Aisyah";             // the dot reaches a field of that object
        a.weightKg = 1.2;

        ParcelE02 b = new ParcelE02();      // a second object with its own fields
        b.recipient = "Ben";
        b.weightKg = 0.4;
        b.delivered = true;

        System.out.println(a.recipient + ", " + a.weightKg + " kg, delivered: " + a.delivered);
        System.out.println(b.recipient + ", " + b.weightKg + " kg, delivered: " + b.delivered);
    }
}
