package W02;

// Two compile errors to try: a wrong type, and a variable used before it has a value.
public class W02E03 {
    public static void main(String[] args) {
        int count = 10;
        System.out.println("count = " + count);

        // Try it: remove the // on one line at a time and compile.
        // int words = "ten";
        //   javac: incompatible types: String cannot be converted to int
        // int total; System.out.println(total);
        //   javac: variable total might not have been initialized
    }
}
