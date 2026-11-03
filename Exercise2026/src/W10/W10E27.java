package W10;

// Try it answer for video #48 (try it yourself first): a class ThermostatE27 with a private target temperature.
// setTarget accepts 16 to 30 degrees only; a rejected value keeps the old one. Add a getter and toString.
class ThermostatE27 {
    private final String room;
    private int target = 24;                        // a sensible start value

    ThermostatE27(String room) {
        this.room = room;
    }

    int getTarget() {
        return target;
    }

    void setTarget(int target) {
        if (target >= 16 && target <= 30) {
            this.target = target;
        } else {
            System.out.println("Rejected: " + target + " (16 to 30 only)");
        }
    }

    public String toString() {
        return room + ": " + target + " degrees";
    }
}

public class W10E27 {
    public static void main(String[] args) {
        ThermostatE27 t = new ThermostatE27("Lab 3");
        t.setTarget(22);
        t.setTarget(5);
        System.out.println(t);
        System.out.println("Target: " + t.getTarget());
    }
}
