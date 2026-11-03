package W11.depot;

import W11.W11Parcel;
import java.util.Locale;

// Try it answer for video #56 (try it yourself first): InsuredParcelE29 in W11.depot extends W11Parcel.
// It reads the protected weightKg through this to work out RM 1.50 insurance per kg.
class InsuredParcelE29 extends W11Parcel {
    InsuredParcelE29(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    public double insurance() {
        return 1.50 * this.weightKg;
    }
}

public class W11E29 {
    public static void main(String[] args) {
        InsuredParcelE29 p = new InsuredParcelE29("MY20005", 2.0);
        System.out.println(p.getTrackingNo() + " insurance: RM " + String.format(Locale.ROOT, "%.2f", p.insurance()));
    }
}
