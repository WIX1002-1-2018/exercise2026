package W11;

// Constructor chaining: new SameDayParcelE04(...) runs four constructors:
// Object(), ParcelE04, ExpressParcelE04 and SameDayParcelE04.
// Each one calls its parent's constructor first (super(...)), then prints,
// so the lines appear from the top class down: Parcel, then Express, then SameDay.
class ParcelE04 {
    final String recipient;

    ParcelE04(String recipient) {
        this.recipient = recipient;
        System.out.println("1. ParcelE04 part ready: " + recipient);
    }
}

class ExpressParcelE04 extends ParcelE04 {
    final int promisedHours;

    ExpressParcelE04(String recipient, int promisedHours) {
        super(recipient);
        this.promisedHours = promisedHours;
        System.out.println("2. ExpressParcelE04 part ready: " + promisedHours + " h");
    }
}

class SameDayParcelE04 extends ExpressParcelE04 {
    final String deadline;

    SameDayParcelE04(String recipient, String deadline) {
        super(recipient, 12);                       // same-day: promised within 12 hours
        this.deadline = deadline;
        System.out.println("3. SameDayParcelE04 part ready: by " + deadline);
    }
}

public class W11E04 {
    public static void main(String[] args) {
        SameDayParcelE04 s = new SameDayParcelE04("Devi", "18:00");
        System.out.println("Done: " + s.recipient + ", " + s.promisedHours + " h, by "
                + s.deadline);
        // Try it: predict the order before you run. Then create an ExpressParcelE04 only.
    }
}
