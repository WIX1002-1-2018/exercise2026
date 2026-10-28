package W10;

// Wrapper classes: every primitive type has a class partner (int → Integer, double → Double, char → Character).
// They give useful constants and static methods, and let a number be used where an object is needed.
// Autoboxing turns int into Integer by itself; unboxing turns it back.
public class W10E18 {
    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int grams = Integer.parseInt("850");            // text to int (Week 9: from a file or keyboard)
        double kg = Double.parseDouble("1.25");
        String text = Integer.toString(grams);          // int to text
        System.out.println(grams + " g, " + kg + " kg, text \"" + text + "\" has "
                + text.length() + " characters");

        Integer boxed = 850;                            // autoboxing (old style new Integer(850) is deprecated)
        Integer fromText = Integer.valueOf("42");       // valueOf: text or int to an Integer object
        int back = boxed;                               // unboxing
        System.out.println("boxed = " + boxed + ", back = " + back + ", fromText = " + fromText);

        Integer a = 127, b = 127, c = 128, d = 128;
        System.out.println("Integer 127 == Integer 127: " + (a == b));  // true: -128 to 127 are cached, one shared object
        System.out.println("Integer 128 == Integer 128: " + (c == d));  // usually false: two different objects
        System.out.println("Integer 128 equals 128: " + c.equals(d));   // compare wrapper values with equals
        // Try it: Integer.parseInt("8.5") or Integer.parseInt("abc"). Read the NumberFormatException.
    }
}
