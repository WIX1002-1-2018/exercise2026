package W12;

// Copying (deck): b = a gives two names for ONE object.
// This copy constructor builds a second object and copies the field values (the String references too).
// b.note = ... puts a new String into the field; it does not change the old String.
// The copy keeps the tracking number, so with the Week 11 rule it is equal (equals) but not the same (==):
// a snapshot of the same parcel.
// clone() here is built on the copy constructor; it legally overrides Object.clone().
// It does not call super.clone(), so it needs no Cloneable and no exception handling.
class ParcelE14 {
    final String trackingNo;
    String note;                                    // can change

    ParcelE14(String trackingNo, String note) {
        this.trackingNo = trackingNo;
        this.note = note;
    }

    ParcelE14(ParcelE14 other) {                    // copy constructor
        this(other.trackingNo, other.note);
    }

    @Override
    public ParcelE14 clone() {
        return new ParcelE14(this);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ParcelE14 other && trackingNo.equals(other.trackingNo);
    }

    @Override
    public int hashCode() {
        return trackingNo.hashCode();
    }
}

public class W12E14 {
    public static void main(String[] args) {
        ParcelE14 a = new ParcelE14("MY30031", "leave at door");
        ParcelE14 b = a;                            // same object
        ParcelE14 c = new ParcelE14(a);             // a copy
        b.note = "call first";
        System.out.println("a.note: " + a.note);
        System.out.println("c.note: " + c.note);
        System.out.println("a == c: " + (a == c) + ", a.equals(c): " + a.equals(c));
        System.out.println("clone note: " + a.clone().note);
    }
}
