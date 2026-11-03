package W10;

// Objects and methods (Week 7: Java passes a copy of each argument).
// For an object, the copy is a copy of the REFERENCE: the method reaches the same object,
// so it can change the object. Giving the parameter a new object does not change the caller's variable.
class ParcelE15 {
    private final String recipient;
    private boolean delivered;

    ParcelE15(String recipient) {
        this.recipient = recipient;
    }

    void markDelivered() {
        delivered = true;
    }

    public String toString() {
        return recipient + ", delivered: " + delivered;
    }
}

public class W10E15 {
    static void deliver(ParcelE15 p) {
        p.markDelivered();                          // changes the object the caller also sees
    }

    static void replace(ParcelE15 p) {
        p = new ParcelE15("Someone else");          // only the local copy of the reference changes
        p.markDelivered();
    }

    public static void main(String[] args) {
        ParcelE15 a = new ParcelE15("Aisyah");
        replace(a);
        System.out.println("After replace: " + a);
        deliver(a);
        System.out.println("After deliver: " + a);
    }
}
