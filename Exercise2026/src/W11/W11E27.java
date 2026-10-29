package W11;

import java.util.Locale;

// Try it answer for video #54 (try it yourself first): StudentTicketE27 overrides price()
// (RM 10.00 off the standard price) and overloads price(int quantity).
class TicketE27 {
    final String event;

    TicketE27(String event) {
        this.event = event;
    }

    double price() {
        return 35.00;
    }
}

class StudentTicketE27 extends TicketE27 {
    StudentTicketE27(String event) {
        super(event);
    }

    @Override
    double price() {
        return super.price() - 10.00;
    }

    double price(int quantity) {                    // overload: a new parameter list
        return price() * quantity;
    }
}

public class W11E27 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        TicketE27 t = new TicketE27("Robotics Fair");
        StudentTicketE27 s = new StudentTicketE27("Robotics Fair");
        System.out.println("Standard: " + rm(t.price()));
        System.out.println("Student:  " + rm(s.price()));
        System.out.println("3 student tickets: " + rm(s.price(3)));
    }
}
