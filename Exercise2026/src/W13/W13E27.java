package W13;

// Try it answer for video #66 (try it yourself first): two resources, a lamp and a fan.
// A power cut happens inside the try: both are still closed, the fan first (reverse order),
// before the catch runs.
class LampE27 implements AutoCloseable {
    LampE27() {
        System.out.println("lamp on");
    }

    void light(String what) {
        System.out.println("lamp lights the " + what);
    }

    @Override
    public void close() {
        System.out.println("lamp off");
    }
}

class FanE27 implements AutoCloseable {
    FanE27() {
        System.out.println("fan on");
    }

    void cool() {
        System.out.println("fan cools the room");
    }

    @Override
    public void close() {
        System.out.println("fan off");
    }
}

public class W13E27 {
    public static void main(String[] args) {
        try (LampE27 lamp = new LampE27(); FanE27 fan = new FanE27()) {
            lamp.light("notes");
            fan.cool();
            throw new IllegalStateException("power cut");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}
