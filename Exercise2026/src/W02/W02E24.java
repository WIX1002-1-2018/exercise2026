package W02;

// Modern Java: var (Java 10) and underscores in numbers (Java 7).
public class W02E24 {
    public static void main(String[] args) {
        var count = 10;                // count is an int
        var name = "Ali";              // name is a String
        int million = 1_000_000;
        long population = 8_100_000_000L;
        System.out.println(count + " " + name);
        System.out.println(million);
        System.out.println(population);

        // Try it: remove the // below and compile. javac says:
        // incompatible types: String cannot be converted to int
        // count = "ten";
    }
}
