package W04;

// Off-by-one: the loop runs one time too many or too few. Check the FIRST and the LAST pass.
// The hall has 10 seats, numbered 1 to 10. The first loop misses seat 10.
public class W04E15 {
    public static void main(String[] args) {
        System.out.print("seat < 10 : ");
        for (int seat = 1; seat < 10; seat++) {
            System.out.print(seat + " ");
        }
        System.out.println();

        System.out.print("seat <= 10: ");
        for (int seat = 1; seat <= 10; seat++) {
            System.out.print(seat + " ");
        }
        System.out.println();

        int passes = 0;
        for (int i = 0; i < 10; i++) {      // starting at 0 with < 10 also gives 10 passes
            passes++;
        }
        System.out.println("0 to 9: " + passes + " passes");
    }
}
