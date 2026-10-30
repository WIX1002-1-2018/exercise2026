package W12;

// An interface is a contract: a class that implements it promises its methods.
// A parcel and a tracking kiosk are unrelated classes, but both are TrackableE09,
// so one TrackableE09[] array can hold both.
interface TrackableE09 {
    String status();                                // public and abstract without saying so
}

class ParcelE09 implements TrackableE09 {
    final String trackingNo;
    final String where;

    ParcelE09(String trackingNo, String where) {
        this.trackingNo = trackingNo;
        this.where = where;
    }

    @Override
    public String status() {
        return "Parcel " + trackingNo + " is at " + where;
    }
}

class KioskE09 implements TrackableE09 {
    final String place;
    final boolean online;

    KioskE09(String place, boolean online) {
        this.place = place;
        this.online = online;
    }

    @Override
    public String status() {
        return "Kiosk " + place + " is " + (online ? "online" : "offline");
    }
}

public class W12E09 {
    public static void main(String[] args) {
        TrackableE09[] board = {
            new ParcelE09("MY30019", "KL hub"),
            new KioskE09("FSKTM lobby", true),
            new ParcelE09("MY30020", "Petaling Jaya")
        };
        for (TrackableE09 t : board) {
            System.out.println(t.status());
        }
    }
}
