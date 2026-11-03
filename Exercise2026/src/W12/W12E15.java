package W12;

import java.util.ArrayList;

// A member inner class lives inside another class (no static).
// Each Stop object belongs to one RouteE15 object, so it can read the route's
// private name directly. Outer and inner classes can use each other's private members.
class RouteE15 {
    private final String name;
    private final ArrayList<Stop> stops = new ArrayList<>();

    RouteE15(String name) {
        this.name = name;
    }

    private class Stop {
        private final String place;

        Stop(String place) {
            this.place = place;
        }

        String show() {
            return name + " stop " + (stops.indexOf(this) + 1) + ": " + place;
        }
    }

    void addStop(String place) {
        stops.add(new Stop(place));                 // made inside a route method, so it belongs to this route
    }

    void print() {
        for (Stop s : stops) {
            System.out.println(s.show());
        }
    }
}

public class W12E15 {
    public static void main(String[] args) {
        RouteE15 r = new RouteE15("Route A");
        r.addStop("FSKTM");
        r.addStop("KL Sentral");
        r.addStop("Mid Valley");
        r.print();
    }
}
