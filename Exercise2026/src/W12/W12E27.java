package W12;

// Try it answer for video #60 (try it yourself first): PlantE27 is abstract.
// Every plant has a watering plan, but only a real kind of plant knows how often.
abstract class PlantE27 {
    final String name;

    PlantE27(String name) {
        this.name = name;
    }

    abstract int waterEveryDays();

    String plan() {
        return name + ": water every " + waterEveryDays() + " days";
    }
}

class CactusE27 extends PlantE27 {
    CactusE27(String name) {
        super(name);
    }

    @Override
    int waterEveryDays() {
        return 14;
    }
}

class FernE27 extends PlantE27 {
    FernE27(String name) {
        super(name);
    }

    @Override
    int waterEveryDays() {
        return 2;
    }
}

public class W12E27 {
    public static void main(String[] args) {
        PlantE27[] shelf = {
            new CactusE27("Desk cactus"),
            new FernE27("Window fern"),
            new CactusE27("Lab cactus")
        };
        for (PlantE27 p : shelf) {
            System.out.println(p.plan());
        }
    }
}
