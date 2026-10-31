package W12;

import java.util.Locale;

// Try it answer for video #58 (try it yourself first): one DrinkE25[] array holds three kinds of drink.
// Each class gives its own price(); the loop prints every price and the total without asking the kind.
class DrinkE25 {
    final String name;
    final double basePrice;

    DrinkE25(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    double price() {
        return basePrice;
    }
}

class IcedDrinkE25 extends DrinkE25 {
    IcedDrinkE25(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    double price() {
        return super.price() + 0.50;                // ice
    }
}

class BubbleTeaE25 extends DrinkE25 {
    BubbleTeaE25(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    double price() {
        return super.price() + 1.50;                // pearls
    }
}

public class W12E25 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        DrinkE25[] order = {
            new DrinkE25("Teh tarik", 2.50),
            new IcedDrinkE25("Milo", 3.00),
            new BubbleTeaE25("Brown sugar milk", 6.00)
        };
        double total = 0;
        for (DrinkE25 d : order) {
            System.out.println(d.name + ": " + rm(d.price()));
            total += d.price();
        }
        System.out.println("Total: " + rm(total));
    }
}
