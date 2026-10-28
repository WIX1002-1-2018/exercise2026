package W10;

// static: a static field belongs to the class, so there is ONE copy shared by all objects.
// Every new parcel takes the next tracking number from the shared counter.
// trackingNo is an instance field (one per parcel); nextNumber is static (one for the class).
class ParcelE11 {
    private static int nextNumber = 10001;          // shared by every ParcelE11
    private final String trackingNo;                // each parcel has its own
    private final String recipient;

    ParcelE11(String recipient) {
        this.recipient = recipient;
        trackingNo = "MY" + nextNumber;
        nextNumber++;
    }

    static int getNextNumber() {                    // a static method: called on the class, no object needed
        return nextNumber;
    }

    public String toString() {
        return trackingNo + " to " + recipient;
    }
}

public class W10E11 {
    public static void main(String[] args) {
        System.out.println("Next number before: " + ParcelE11.getNextNumber());
        ParcelE11 a = new ParcelE11("Aisyah");
        ParcelE11 b = new ParcelE11("Ben");
        ParcelE11 c = new ParcelE11("Chong");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Next number after:  " + ParcelE11.getNextNumber());
    }
}
