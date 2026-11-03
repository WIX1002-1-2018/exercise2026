package W10;

import java.util.Locale;

// Modern Java, good to know: a record (Java 16) is a short way to write a class that only carries data.
// One line gives the constructor, the getters (to(), kg()), toString, and equals that compares the values.
// The fields of a record are final (this one holds a String and a double, so it cannot change after it is made).
// Its equals compares ALL the values; W10E09's equals compared only the tracking number.
// A compact constructor checks the values. throw stops with an error (exceptions: Week 13).
record ParcelRecordE20(String trackingNo, String to, double kg) {
    ParcelRecordE20 {
        if (!(kg > 0 && kg < 1000)) {                   // also rejects NaN and infinity
            throw new IllegalArgumentException("weight must be over 0 and under 1000 kg");
        }
    }

    double fee() {                                  // a record can have its own methods too
        return 5.00 + 2.00 * kg;
    }
}

public class W10E20 {
    public static void main(String[] args) {
        ParcelRecordE20 a = new ParcelRecordE20("MY10001", "Aisyah", 1.2);
        ParcelRecordE20 b = new ParcelRecordE20("MY10001", "Aisyah", 1.2);
        System.out.println(a);                      // toString comes free
        System.out.println("To: " + a.to() + ", " + a.kg() + " kg, fee RM "
                + String.format(Locale.ROOT, "%.2f", a.fee()));
        System.out.println("a.equals(b): " + a.equals(b) + ", a == b: " + (a == b));
        // Try it: new ParcelRecordE20("MY10002", "Ben", -1) and read the message.
    }
}
