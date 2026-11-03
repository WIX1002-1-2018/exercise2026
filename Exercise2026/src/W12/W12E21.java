package W12;

import java.util.Locale;

// Deck exercise: abstract class or interface?
// Abstract class: shared fields and code for one family (every delivery item has a tracking number).
// Interface: a promise that unrelated classes can make (a parcel and a kiosk can both report a status).
// ParcelE21 uses both; KioskE21 is not a delivery item, so it only implements the interface.
abstract class DeliveryItemE21 {
    final String trackingNo;

    DeliveryItemE21(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    abstract double fee();
}

interface TrackableE21 {
    String status();
}

class ParcelE21 extends DeliveryItemE21 implements TrackableE21 {
    ParcelE21(String trackingNo) {
        super(trackingNo);
    }

    @Override
    double fee() {
        return 8.00;
    }

    @Override
    public String status() {
        return "Parcel " + trackingNo + " sorted";
    }
}

class KioskE21 implements TrackableE21 {
    @Override
    public String status() {
        return "Kiosk FSKTM lobby online";
    }
}

public class W12E21 {
    public static void main(String[] args) {
        TrackableE21[] board = { new ParcelE21("MY30044"), new KioskE21() };
        for (TrackableE21 t : board) {
            System.out.println(t.status());
        }
        DeliveryItemE21 d = new ParcelE21("MY30045");
        System.out.println(d.trackingNo + " fee RM " + String.format(Locale.ROOT, "%.2f", d.fee()));
    }
}
