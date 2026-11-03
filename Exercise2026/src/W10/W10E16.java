package W10;

// Objects inside objects: a DeliveryRouteE16 holds an array of ParcelE16 objects.
// The route's methods work on its parcels, so main only talks to the route.
class ParcelE16 {
    private final String trackingNo;
    private final String recipient;
    private boolean delivered;

    ParcelE16(String trackingNo, String recipient) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
    }

    String getTrackingNo() {
        return trackingNo;
    }

    boolean isDelivered() {
        return delivered;
    }

    void markDelivered() {
        delivered = true;
    }

    public String toString() {
        if (delivered) {
            return trackingNo + " to " + recipient + " (delivered)";
        }
        return trackingNo + " to " + recipient + " (waiting)";
    }
}

class DeliveryRouteE16 {
    private final String driver;
    private final ParcelE16[] parcels = new ParcelE16[10];    // final: always this array; its slots can still change
    private int count = 0;

    DeliveryRouteE16(String driver) {
        this.driver = driver;
    }

    boolean add(ParcelE16 p) {
        if (p == null || count == parcels.length) {
            return false;                           // no parcel, or the van is full
        }
        parcels[count] = p;
        count++;
        return true;
    }

    boolean markDelivered(String trackingNo) {
        for (int i = 0; i < count; i++) {
            if (parcels[i].getTrackingNo().equals(trackingNo)) {
                parcels[i].markDelivered();
                return true;
            }
        }
        return false;                               // no parcel with that number
    }

    int waiting() {
        int n = 0;
        for (int i = 0; i < count; i++) {
            if (!parcels[i].isDelivered()) {
                n++;
            }
        }
        return n;
    }

    void print() {
        System.out.println("Route of " + driver + ", " + count + " parcels, " + waiting() + " waiting:");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + parcels[i]);
        }
    }
}

public class W10E16 {
    public static void main(String[] args) {
        DeliveryRouteE16 route = new DeliveryRouteE16("Farid");
        route.add(new ParcelE16("MY10001", "Aisyah"));
        route.add(new ParcelE16("MY10002", "Ben"));
        route.add(new ParcelE16("MY10003", "Chong"));

        System.out.println("Deliver MY10002: " + route.markDelivered("MY10002"));
        System.out.println("Deliver MY99999: " + route.markDelivered("MY99999"));
        route.print();
    }
}
