package W02;

// print, println and printf with the common format codes.
public class W02E20 {
    public static void main(String[] args) {
        System.out.print("A");
        System.out.print("B");
        System.out.println();
        System.out.println("A");
        System.out.println("B");

        System.out.printf("%d%n", 42);
        System.out.printf("%s%n", "Java");
        System.out.printf("%.2f%n", 22 / 7.0);
        System.out.printf("|%5d|%n", 42);
        System.out.printf("|%-5d|%n", 42);
        System.out.printf("|%6.2f|%n", 22 / 7.0);
    }
}
