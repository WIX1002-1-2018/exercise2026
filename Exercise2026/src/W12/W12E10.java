package W12;

import java.util.Locale;

// A class extends one class but may implement several interfaces.
// An interface field is a constant: public static final without saying so.
interface TrackableE10 {
    String status();
}

interface InsurableE10 {
    double MAX_COVER_RM = 500.00;                   // a constant

    double cover();
}

class ParcelE10 {
    final String trackingNo;

    ParcelE10(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class FragileParcelE10 extends ParcelE10 implements TrackableE10, InsurableE10 {
    final double declaredValueRm;

    FragileParcelE10(String trackingNo, double declaredValueRm) {
        super(trackingNo);
        this.declaredValueRm = declaredValueRm;
    }

    @Override
    public String status() {
        return "Fragile " + trackingNo + " is packed";
    }

    @Override
    public double cover() {
        return Math.min(declaredValueRm, MAX_COVER_RM);
    }
}

public class W12E10 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        FragileParcelE10 a = new FragileParcelE10("MY30021", 350.00);
        FragileParcelE10 b = new FragileParcelE10("MY30022", 800.00);
        System.out.println(a.status() + ", cover " + rm(a.cover()));
        System.out.println(b.status() + ", cover " + rm(b.cover()));
        System.out.println("Maximum cover: " + rm(InsurableE10.MAX_COVER_RM));
    }
}
