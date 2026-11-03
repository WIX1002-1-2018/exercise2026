package W13;

// Good to know (Java 14): helpful NullPointerException messages.
// The JVM names what was null, here the local variable tracking.
// (This program stops on purpose. The exact wording can depend on how the program was compiled and run.)
public class W13E16 {
    public static void main(String[] args) {
        String tracking = null;                      // e.g. a field that was never filled in
        System.out.println("checking a parcel");
        System.out.println(tracking.length());
    }
}
