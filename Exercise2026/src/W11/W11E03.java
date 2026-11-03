package W11;

// private stays private: private fields are not inherited.
// Each subclass object still contains the parent's private state.
// Here the subclass reads that state through getters accessible in the same package.
class ParcelE03 {
    private final String recipient;
    private final double weightKg;

    ParcelE03(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    String getRecipient() {
        return recipient;
    }

    double getWeightKg() {
        return weightKg;
    }
}

class HeavyCheckParcelE03 extends ParcelE03 {
    HeavyCheckParcelE03(String recipient, double weightKg) {
        super(recipient, weightKg);
    }

    boolean isHeavy() {
        return getWeightKg() > 20;                  // through the getter, not weightKg
    }
}

public class W11E03 {
    public static void main(String[] args) {
        HeavyCheckParcelE03 a = new HeavyCheckParcelE03("Aisyah", 1.2);
        HeavyCheckParcelE03 c = new HeavyCheckParcelE03("Chong", 25.0);
        System.out.println(a.getRecipient() + " heavy: " + a.isHeavy());
        System.out.println(c.getRecipient() + " heavy: " + c.isHeavy());
        // Try it: in isHeavy, write  return weightKg > 20;  and read the compiler message.
    }
}
