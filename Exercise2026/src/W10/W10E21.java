package W10;

import java.util.Locale;

// Three common mistakes with classes (Try it: undo each fix and read what happens).
// 1. A variable of a class type holds a reference; null means it refers to no object yet.
// 2. main is static, so it has no W10E21 object: an instance field needs an object first.
// 3. == on objects compares references, not the values inside.
class ParcelE21 {
    String recipient;
    double weightKg;

    double fee() {
        return 5.00 + 2.00 * weightKg;
    }
}

public class W10E21 {
    double total;                                   // an instance field of W10E21

    public static void main(String[] args) {
        // 1. Try it: remove the  p = new ParcelE21();  line: p.weightKg then throws a NullPointerException.
        ParcelE21 p = null;
        p = new ParcelE21();
        p.recipient = "Aisyah";
        p.weightKg = 1.2;

        // 2. Try it: write  total += p.fee();  here. The compiler says that a non-static variable
        //    cannot be referenced from a static context. The fix: make an object, then use its field.
        W10E21 app = new W10E21();
        app.total += p.fee();
        System.out.println("Total fees: RM " + String.format(Locale.ROOT, "%.2f", app.total));

        // 3. Two parcels with the same values are still two objects.
        ParcelE21 q = new ParcelE21();
        q.recipient = "Aisyah";
        q.weightKg = 1.2;
        System.out.println("p == q: " + (p == q) + " (two objects; write an equals method to compare values, see W10E09)");
    }
}
