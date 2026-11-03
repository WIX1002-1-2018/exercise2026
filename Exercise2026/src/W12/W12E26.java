package W12;

// Try it answer for video #59 (try it yourself first): only bubble teas have a topping.
// The instanceof pattern checks each drink and names it b, so b.getTopping() is allowed.
class DrinkE26 {
    final String name;

    DrinkE26(String name) {
        this.name = name;
    }
}

class BubbleTeaE26 extends DrinkE26 {
    private final String topping;

    BubbleTeaE26(String name, String topping) {
        super(name);
        this.topping = topping;
    }

    String getTopping() {
        return topping;
    }
}

public class W12E26 {
    public static void main(String[] args) {
        DrinkE26[] order = {
            new DrinkE26("Teh tarik"),
            new BubbleTeaE26("Brown sugar milk", "pearls"),
            new DrinkE26("Milo"),
            new BubbleTeaE26("Taro milk", "pudding")
        };
        for (DrinkE26 d : order) {
            if (d instanceof BubbleTeaE26 b) {
                System.out.println(d.name + ": " + b.getTopping());
            }
        }
    }
}
