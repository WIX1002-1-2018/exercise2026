package W10;

import java.util.Locale;

// Try it answer for video #47 (try it yourself first): a class TicketE26 with two constructors:
// (event, price) and (event) that uses this(...) with the standard price RM 20.00, plus a copy constructor.
class TicketE26 {
    String event;
    double price;

    TicketE26(String event, double price) {
        this.event = event;
        this.price = price;
    }

    TicketE26(String event) {
        this(event, 20.00);                         // the standard price
    }

    TicketE26(TicketE26 other) {                    // copy constructor
        this(other.event, other.price);
    }

    public String toString() {
        return event + ", RM " + String.format(Locale.ROOT, "%.2f", price);
    }
}

public class W10E26 {
    public static void main(String[] args) {
        TicketE26 a = new TicketE26("Robotics Fair", 35.00);
        TicketE26 b = new TicketE26("Open Day");
        TicketE26 c = new TicketE26(b);
        c.price = 10.00;                            // a student price on the copy only
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
