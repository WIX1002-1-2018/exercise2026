package W11;

// Every constructor chain outside Object must reach a superclass constructor.
// ParcelE05 has no no-argument constructor, so the implicit super() would not compile.
// FragileParcelE05 reaches it directly with super(...),
// or through this(...) in its second constructor.
class ParcelE05 {
    final String recipient;
    final double weightKg;

    ParcelE05(String recipient, double weightKg) {  // the only constructor
        this.recipient = recipient;
        this.weightKg = weightKg;
    }
}

class FragileParcelE05 extends ParcelE05 {
    final String label;

    FragileParcelE05(String recipient, double weightKg, String label) {
        super(recipient, weightKg);                 // direct: reaches ParcelE05
        this.label = label;
    }

    FragileParcelE05(String recipient, double weightKg) {
        this(recipient, weightKg, "FRAGILE");       // through this(...): still reaches ParcelE05
    }
}

public class W11E05 {
    public static void main(String[] args) {
        FragileParcelE05 a = new FragileParcelE05("Aisyah", 1.2, "GLASS");
        FragileParcelE05 b = new FragileParcelE05("Ben", 0.4);
        System.out.println(a.recipient + ", " + a.weightKg + " kg, " + a.label);
        System.out.println(b.recipient + ", " + b.weightKg + " kg, " + b.label);
        // Try it: delete the line super(recipient, weightKg); and read the compiler message.
    }
}
