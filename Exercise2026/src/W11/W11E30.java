package W11;

import java.util.Locale;

// Try it answer for video #57 (try it yourself first): a sealed DeliveryE30 with two final subclasses.
// code() is final, so every delivery keeps the same code format; cost() is overridden.
sealed class DeliveryE30 permits BikeDeliveryE30, VanDeliveryE30 {
    private final String id;

    DeliveryE30(String id) {
        this.id = id;
    }

    final String code() {
        return "DL-" + id;
    }

    double cost() {
        return 4.00;
    }
}

final class BikeDeliveryE30 extends DeliveryE30 {
    BikeDeliveryE30(String id) {
        super(id);
    }

    @Override
    double cost() {
        return super.cost() + 1.50;
    }
}

final class VanDeliveryE30 extends DeliveryE30 {
    VanDeliveryE30(String id) {
        super(id);
    }

    @Override
    double cost() {
        return super.cost() + 6.00;
    }
}

public class W11E30 {
    public static void main(String[] args) {
        BikeDeliveryE30 b = new BikeDeliveryE30("101");
        VanDeliveryE30 v = new VanDeliveryE30("102");
        System.out.println(b.code() + " by bike: RM " + String.format(Locale.ROOT, "%.2f", b.cost()));
        System.out.println(v.code() + " by van:  RM " + String.format(Locale.ROOT, "%.2f", v.cost()));
    }
}
