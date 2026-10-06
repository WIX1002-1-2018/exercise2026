package W03;

// Relational operators compare two values and give a boolean: true or false.
public class W03E01 {
    public static void main(String[] args) {
        int a = 7, b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= 7);
        System.out.println(a < b);
        System.out.println(b <= 3);
        boolean passed = a >= 5;        // a boolean variable can keep the result
        System.out.println("passed = " + passed);
    }
}
