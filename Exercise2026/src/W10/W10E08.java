package W10;

// Getters and setters: getX() reads a field, setX(...) changes it, isX() reads a boolean.
// A field with a getter but no setter cannot be changed from outside; final means it cannot get a new value.
// A method with a clear meaning (markDelivered) is often better than a plain setter.
class ParcelE08 {
    private final String trackingNo;                // set once in the constructor, no setter
    private String recipient;
    private boolean delivered;

    ParcelE08(String trackingNo, String recipient) {   // trackingNo: two letters and five digits, e.g. MY10001
        this.trackingNo = trackingNo;
        this.recipient = "unknown";                 // a safe value first ...
        setRecipient(recipient);                    // ... then the same check as the setter
    }

    String getTrackingNo() {
        return trackingNo;
    }

    String getRecipient() {
        return recipient;
    }

    void setRecipient(String recipient) {
        if (recipient == null || recipient.isBlank()) {
            System.out.println("Rejected: a recipient name is needed");
            return;
        }
        this.recipient = recipient;
    }

    boolean isDelivered() {                         // boolean getter: is..., not get...
        return delivered;
    }

    void markDelivered() {
        delivered = true;
    }
}

public class W10E08 {
    public static void main(String[] args) {
        ParcelE08 p = new ParcelE08("MY10001", "Aisyah");
        System.out.println(p.getTrackingNo() + " to " + p.getRecipient() + ", delivered: " + p.isDelivered());

        p.setRecipient("Ben");                      // accepted
        p.setRecipient("   ");                      // rejected
        p.markDelivered();
        System.out.println(p.getTrackingNo() + " to " + p.getRecipient() + ", delivered: " + p.isDelivered());
    }
}
