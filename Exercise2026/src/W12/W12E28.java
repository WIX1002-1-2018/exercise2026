package W12;

// Try it answer for video #61 (try it yourself first): a movie and a cafe are unrelated,
// but both implement RateableE28, so one array holds both and the average needs no cast.
interface RateableE28 {
    String title();

    int stars();
}

class MovieE28 implements RateableE28 {
    private final String name;
    private final int stars;

    MovieE28(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    @Override
    public String title() {
        return "Movie " + name;
    }

    @Override
    public int stars() {
        return stars;
    }
}

class CafeE28 implements RateableE28 {
    private final String name;
    private final int stars;

    CafeE28(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    @Override
    public String title() {
        return "Cafe " + name;
    }

    @Override
    public int stars() {
        return stars;
    }
}

public class W12E28 {
    public static void main(String[] args) {
        RateableE28[] list = {
            new MovieE28("Campus Nights", 4),
            new CafeE28("Kopi Corner", 5),
            new MovieE28("Rain Season", 3)
        };
        int sum = 0;
        for (RateableE28 r : list) {
            System.out.println(r.title() + ": " + r.stars() + " stars");
            sum += r.stars();
        }
        System.out.println("Average: " + (double) sum / list.length + " stars");
    }
}
